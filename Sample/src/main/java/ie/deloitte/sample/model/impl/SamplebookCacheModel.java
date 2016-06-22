package ie.deloitte.sample.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ie.deloitte.sample.model.Samplebook;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Samplebook in entity cache.
 *
 * @author JY
 * @see Samplebook
 * @generated
 */
public class SamplebookCacheModel implements CacheModel<Samplebook>,
    Externalizable {
    public String uuid;
    public long guestbookId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", guestbookId=");
        sb.append(guestbookId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Samplebook toEntityModel() {
        SamplebookImpl samplebookImpl = new SamplebookImpl();

        if (uuid == null) {
            samplebookImpl.setUuid(StringPool.BLANK);
        } else {
            samplebookImpl.setUuid(uuid);
        }

        samplebookImpl.setGuestbookId(guestbookId);
        samplebookImpl.setGroupId(groupId);
        samplebookImpl.setCompanyId(companyId);
        samplebookImpl.setUserId(userId);

        if (userName == null) {
            samplebookImpl.setUserName(StringPool.BLANK);
        } else {
            samplebookImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            samplebookImpl.setCreateDate(null);
        } else {
            samplebookImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            samplebookImpl.setModifiedDate(null);
        } else {
            samplebookImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            samplebookImpl.setName(StringPool.BLANK);
        } else {
            samplebookImpl.setName(name);
        }

        samplebookImpl.resetOriginalValues();

        return samplebookImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        guestbookId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(guestbookId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }
    }
}
