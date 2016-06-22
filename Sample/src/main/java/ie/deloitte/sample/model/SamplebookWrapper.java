package ie.deloitte.sample.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Samplebook}.
 * </p>
 *
 * @author JY
 * @see Samplebook
 * @generated
 */
public class SamplebookWrapper implements Samplebook, ModelWrapper<Samplebook> {
    private Samplebook _samplebook;

    public SamplebookWrapper(Samplebook samplebook) {
        _samplebook = samplebook;
    }

    @Override
    public Class<?> getModelClass() {
        return Samplebook.class;
    }

    @Override
    public String getModelClassName() {
        return Samplebook.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("guestbookId", getGuestbookId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long guestbookId = (Long) attributes.get("guestbookId");

        if (guestbookId != null) {
            setGuestbookId(guestbookId);
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
    }

    /**
    * Returns the primary key of this samplebook.
    *
    * @return the primary key of this samplebook
    */
    @Override
    public long getPrimaryKey() {
        return _samplebook.getPrimaryKey();
    }

    /**
    * Sets the primary key of this samplebook.
    *
    * @param primaryKey the primary key of this samplebook
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _samplebook.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this samplebook.
    *
    * @return the uuid of this samplebook
    */
    @Override
    public java.lang.String getUuid() {
        return _samplebook.getUuid();
    }

    /**
    * Sets the uuid of this samplebook.
    *
    * @param uuid the uuid of this samplebook
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _samplebook.setUuid(uuid);
    }

    /**
    * Returns the guestbook ID of this samplebook.
    *
    * @return the guestbook ID of this samplebook
    */
    @Override
    public long getGuestbookId() {
        return _samplebook.getGuestbookId();
    }

    /**
    * Sets the guestbook ID of this samplebook.
    *
    * @param guestbookId the guestbook ID of this samplebook
    */
    @Override
    public void setGuestbookId(long guestbookId) {
        _samplebook.setGuestbookId(guestbookId);
    }

    /**
    * Returns the group ID of this samplebook.
    *
    * @return the group ID of this samplebook
    */
    @Override
    public long getGroupId() {
        return _samplebook.getGroupId();
    }

    /**
    * Sets the group ID of this samplebook.
    *
    * @param groupId the group ID of this samplebook
    */
    @Override
    public void setGroupId(long groupId) {
        _samplebook.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this samplebook.
    *
    * @return the company ID of this samplebook
    */
    @Override
    public long getCompanyId() {
        return _samplebook.getCompanyId();
    }

    /**
    * Sets the company ID of this samplebook.
    *
    * @param companyId the company ID of this samplebook
    */
    @Override
    public void setCompanyId(long companyId) {
        _samplebook.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this samplebook.
    *
    * @return the user ID of this samplebook
    */
    @Override
    public long getUserId() {
        return _samplebook.getUserId();
    }

    /**
    * Sets the user ID of this samplebook.
    *
    * @param userId the user ID of this samplebook
    */
    @Override
    public void setUserId(long userId) {
        _samplebook.setUserId(userId);
    }

    /**
    * Returns the user uuid of this samplebook.
    *
    * @return the user uuid of this samplebook
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _samplebook.getUserUuid();
    }

    /**
    * Sets the user uuid of this samplebook.
    *
    * @param userUuid the user uuid of this samplebook
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _samplebook.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this samplebook.
    *
    * @return the user name of this samplebook
    */
    @Override
    public java.lang.String getUserName() {
        return _samplebook.getUserName();
    }

    /**
    * Sets the user name of this samplebook.
    *
    * @param userName the user name of this samplebook
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _samplebook.setUserName(userName);
    }

    /**
    * Returns the create date of this samplebook.
    *
    * @return the create date of this samplebook
    */
    @Override
    public java.util.Date getCreateDate() {
        return _samplebook.getCreateDate();
    }

    /**
    * Sets the create date of this samplebook.
    *
    * @param createDate the create date of this samplebook
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _samplebook.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this samplebook.
    *
    * @return the modified date of this samplebook
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _samplebook.getModifiedDate();
    }

    /**
    * Sets the modified date of this samplebook.
    *
    * @param modifiedDate the modified date of this samplebook
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _samplebook.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this samplebook.
    *
    * @return the name of this samplebook
    */
    @Override
    public java.lang.String getName() {
        return _samplebook.getName();
    }

    /**
    * Sets the name of this samplebook.
    *
    * @param name the name of this samplebook
    */
    @Override
    public void setName(java.lang.String name) {
        _samplebook.setName(name);
    }

    @Override
    public boolean isNew() {
        return _samplebook.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _samplebook.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _samplebook.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _samplebook.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _samplebook.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _samplebook.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _samplebook.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _samplebook.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _samplebook.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _samplebook.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _samplebook.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new SamplebookWrapper((Samplebook) _samplebook.clone());
    }

    @Override
    public int compareTo(ie.deloitte.sample.model.Samplebook samplebook) {
        return _samplebook.compareTo(samplebook);
    }

    @Override
    public int hashCode() {
        return _samplebook.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ie.deloitte.sample.model.Samplebook> toCacheModel() {
        return _samplebook.toCacheModel();
    }

    @Override
    public ie.deloitte.sample.model.Samplebook toEscapedModel() {
        return new SamplebookWrapper(_samplebook.toEscapedModel());
    }

    @Override
    public ie.deloitte.sample.model.Samplebook toUnescapedModel() {
        return new SamplebookWrapper(_samplebook.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _samplebook.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _samplebook.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _samplebook.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof SamplebookWrapper)) {
            return false;
        }

        SamplebookWrapper samplebookWrapper = (SamplebookWrapper) obj;

        if (Validator.equals(_samplebook, samplebookWrapper._samplebook)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _samplebook.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Samplebook getWrappedSamplebook() {
        return _samplebook;
    }

    @Override
    public Samplebook getWrappedModel() {
        return _samplebook;
    }

    @Override
    public void resetOriginalValues() {
        _samplebook.resetOriginalValues();
    }
}
