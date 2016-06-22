package ie.deloitte.sample.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ie.deloitte.sample.model.Sampleentry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Sampleentry in entity cache.
 *
 * @author JY
 * @see Sampleentry
 * @generated
 */
public class SampleentryCacheModel implements CacheModel<Sampleentry>,
    Externalizable {
    public String uuid;
    public long entryId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String message;
    public String email;
    public long guestbookId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", entryId=");
        sb.append(entryId);
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
        sb.append(", message=");
        sb.append(message);
        sb.append(", email=");
        sb.append(email);
        sb.append(", guestbookId=");
        sb.append(guestbookId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Sampleentry toEntityModel() {
        SampleentryImpl sampleentryImpl = new SampleentryImpl();

        if (uuid == null) {
            sampleentryImpl.setUuid(StringPool.BLANK);
        } else {
            sampleentryImpl.setUuid(uuid);
        }

        sampleentryImpl.setEntryId(entryId);
        sampleentryImpl.setGroupId(groupId);
        sampleentryImpl.setCompanyId(companyId);
        sampleentryImpl.setUserId(userId);

        if (userName == null) {
            sampleentryImpl.setUserName(StringPool.BLANK);
        } else {
            sampleentryImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            sampleentryImpl.setCreateDate(null);
        } else {
            sampleentryImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            sampleentryImpl.setModifiedDate(null);
        } else {
            sampleentryImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            sampleentryImpl.setName(StringPool.BLANK);
        } else {
            sampleentryImpl.setName(name);
        }

        if (message == null) {
            sampleentryImpl.setMessage(StringPool.BLANK);
        } else {
            sampleentryImpl.setMessage(message);
        }

        if (email == null) {
            sampleentryImpl.setEmail(StringPool.BLANK);
        } else {
            sampleentryImpl.setEmail(email);
        }

        sampleentryImpl.setGuestbookId(guestbookId);

        sampleentryImpl.resetOriginalValues();

        return sampleentryImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        entryId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        message = objectInput.readUTF();
        email = objectInput.readUTF();
        guestbookId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(entryId);
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

        if (message == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(message);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }

        objectOutput.writeLong(guestbookId);
    }
}
