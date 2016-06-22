package ie.deloitte.sample.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sampleentry}.
 * </p>
 *
 * @author JY
 * @see Sampleentry
 * @generated
 */
public class SampleentryWrapper implements Sampleentry,
    ModelWrapper<Sampleentry> {
    private Sampleentry _sampleentry;

    public SampleentryWrapper(Sampleentry sampleentry) {
        _sampleentry = sampleentry;
    }

    @Override
    public Class<?> getModelClass() {
        return Sampleentry.class;
    }

    @Override
    public String getModelClassName() {
        return Sampleentry.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("entryId", getEntryId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("message", getMessage());
        attributes.put("email", getEmail());
        attributes.put("guestbookId", getGuestbookId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long entryId = (Long) attributes.get("entryId");

        if (entryId != null) {
            setEntryId(entryId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String message = (String) attributes.get("message");

        if (message != null) {
            setMessage(message);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        Long guestbookId = (Long) attributes.get("guestbookId");

        if (guestbookId != null) {
            setGuestbookId(guestbookId);
        }
    }

    /**
    * Returns the primary key of this sampleentry.
    *
    * @return the primary key of this sampleentry
    */
    @Override
    public long getPrimaryKey() {
        return _sampleentry.getPrimaryKey();
    }

    /**
    * Sets the primary key of this sampleentry.
    *
    * @param primaryKey the primary key of this sampleentry
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _sampleentry.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this sampleentry.
    *
    * @return the uuid of this sampleentry
    */
    @Override
    public java.lang.String getUuid() {
        return _sampleentry.getUuid();
    }

    /**
    * Sets the uuid of this sampleentry.
    *
    * @param uuid the uuid of this sampleentry
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _sampleentry.setUuid(uuid);
    }

    /**
    * Returns the entry ID of this sampleentry.
    *
    * @return the entry ID of this sampleentry
    */
    @Override
    public long getEntryId() {
        return _sampleentry.getEntryId();
    }

    /**
    * Sets the entry ID of this sampleentry.
    *
    * @param entryId the entry ID of this sampleentry
    */
    @Override
    public void setEntryId(long entryId) {
        _sampleentry.setEntryId(entryId);
    }

    /**
    * Returns the group ID of this sampleentry.
    *
    * @return the group ID of this sampleentry
    */
    @Override
    public long getGroupId() {
        return _sampleentry.getGroupId();
    }

    /**
    * Sets the group ID of this sampleentry.
    *
    * @param groupId the group ID of this sampleentry
    */
    @Override
    public void setGroupId(long groupId) {
        _sampleentry.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this sampleentry.
    *
    * @return the company ID of this sampleentry
    */
    @Override
    public long getCompanyId() {
        return _sampleentry.getCompanyId();
    }

    /**
    * Sets the company ID of this sampleentry.
    *
    * @param companyId the company ID of this sampleentry
    */
    @Override
    public void setCompanyId(long companyId) {
        _sampleentry.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this sampleentry.
    *
    * @return the user ID of this sampleentry
    */
    @Override
    public long getUserId() {
        return _sampleentry.getUserId();
    }

    /**
    * Sets the user ID of this sampleentry.
    *
    * @param userId the user ID of this sampleentry
    */
    @Override
    public void setUserId(long userId) {
        _sampleentry.setUserId(userId);
    }

    /**
    * Returns the user uuid of this sampleentry.
    *
    * @return the user uuid of this sampleentry
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sampleentry.getUserUuid();
    }

    /**
    * Sets the user uuid of this sampleentry.
    *
    * @param userUuid the user uuid of this sampleentry
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _sampleentry.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this sampleentry.
    *
    * @return the user name of this sampleentry
    */
    @Override
    public java.lang.String getUserName() {
        return _sampleentry.getUserName();
    }

    /**
    * Sets the user name of this sampleentry.
    *
    * @param userName the user name of this sampleentry
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _sampleentry.setUserName(userName);
    }

    /**
    * Returns the create date of this sampleentry.
    *
    * @return the create date of this sampleentry
    */
    @Override
    public java.util.Date getCreateDate() {
        return _sampleentry.getCreateDate();
    }

    /**
    * Sets the create date of this sampleentry.
    *
    * @param createDate the create date of this sampleentry
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _sampleentry.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this sampleentry.
    *
    * @return the modified date of this sampleentry
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _sampleentry.getModifiedDate();
    }

    /**
    * Sets the modified date of this sampleentry.
    *
    * @param modifiedDate the modified date of this sampleentry
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _sampleentry.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this sampleentry.
    *
    * @return the name of this sampleentry
    */
    @Override
    public java.lang.String getName() {
        return _sampleentry.getName();
    }

    /**
    * Sets the name of this sampleentry.
    *
    * @param name the name of this sampleentry
    */
    @Override
    public void setName(java.lang.String name) {
        _sampleentry.setName(name);
    }

    /**
    * Returns the message of this sampleentry.
    *
    * @return the message of this sampleentry
    */
    @Override
    public java.lang.String getMessage() {
        return _sampleentry.getMessage();
    }

    /**
    * Sets the message of this sampleentry.
    *
    * @param message the message of this sampleentry
    */
    @Override
    public void setMessage(java.lang.String message) {
        _sampleentry.setMessage(message);
    }

    /**
    * Returns the email of this sampleentry.
    *
    * @return the email of this sampleentry
    */
    @Override
    public java.lang.String getEmail() {
        return _sampleentry.getEmail();
    }

    /**
    * Sets the email of this sampleentry.
    *
    * @param email the email of this sampleentry
    */
    @Override
    public void setEmail(java.lang.String email) {
        _sampleentry.setEmail(email);
    }

    /**
    * Returns the guestbook ID of this sampleentry.
    *
    * @return the guestbook ID of this sampleentry
    */
    @Override
    public long getGuestbookId() {
        return _sampleentry.getGuestbookId();
    }

    /**
    * Sets the guestbook ID of this sampleentry.
    *
    * @param guestbookId the guestbook ID of this sampleentry
    */
    @Override
    public void setGuestbookId(long guestbookId) {
        _sampleentry.setGuestbookId(guestbookId);
    }

    @Override
    public boolean isNew() {
        return _sampleentry.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _sampleentry.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _sampleentry.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _sampleentry.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _sampleentry.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _sampleentry.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _sampleentry.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _sampleentry.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _sampleentry.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _sampleentry.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _sampleentry.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SampleentryWrapper((Sampleentry) _sampleentry.clone());
    }

    @Override
    public int compareTo(ie.deloitte.sample.model.Sampleentry sampleentry) {
        return _sampleentry.compareTo(sampleentry);
    }

    @Override
    public int hashCode() {
        return _sampleentry.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ie.deloitte.sample.model.Sampleentry> toCacheModel() {
        return _sampleentry.toCacheModel();
    }

    @Override
    public ie.deloitte.sample.model.Sampleentry toEscapedModel() {
        return new SampleentryWrapper(_sampleentry.toEscapedModel());
    }

    @Override
    public ie.deloitte.sample.model.Sampleentry toUnescapedModel() {
        return new SampleentryWrapper(_sampleentry.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _sampleentry.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _sampleentry.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _sampleentry.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SampleentryWrapper)) {
            return false;
        }

        SampleentryWrapper sampleentryWrapper = (SampleentryWrapper) obj;

        if (Validator.equals(_sampleentry, sampleentryWrapper._sampleentry)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _sampleentry.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Sampleentry getWrappedSampleentry() {
        return _sampleentry;
    }

    @Override
    public Sampleentry getWrappedModel() {
        return _sampleentry;
    }

    @Override
    public void resetOriginalValues() {
        _sampleentry.resetOriginalValues();
    }
}
