package ie.deloitte.sample.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ie.deloitte.sample.model.Samplebook;

/**
 * The persistence interface for the samplebook service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author JY
 * @see SamplebookPersistenceImpl
 * @see SamplebookUtil
 * @generated
 */
public interface SamplebookPersistence extends BasePersistence<Samplebook> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SamplebookUtil} to access the samplebook persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the samplebooks where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the samplebooks where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of samplebooks
    * @param end the upper bound of the range of samplebooks (not inclusive)
    * @return the range of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the samplebooks where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of samplebooks
    * @param end the upper bound of the range of samplebooks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first samplebook in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Returns the first samplebook in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last samplebook in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Returns the last samplebook in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the samplebooks before and after the current samplebook in the ordered set where uuid = &#63;.
    *
    * @param guestbookId the primary key of the current samplebook
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook[] findByUuid_PrevAndNext(
        long guestbookId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Removes all the samplebooks where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of samplebooks where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the samplebook where uuid = &#63; and groupId = &#63; or throws a {@link ie.deloitte.sample.NoSuchSamplebookException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Returns the samplebook where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the samplebook where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the samplebook where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the samplebook that was removed
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Returns the number of samplebooks where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the samplebooks where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the samplebooks where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of samplebooks
    * @param end the upper bound of the range of samplebooks (not inclusive)
    * @return the range of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the samplebooks where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of samplebooks
    * @param end the upper bound of the range of samplebooks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first samplebook in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Returns the first samplebook in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last samplebook in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Returns the last samplebook in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the samplebooks before and after the current samplebook in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param guestbookId the primary key of the current samplebook
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook[] findByUuid_C_PrevAndNext(
        long guestbookId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Removes all the samplebooks where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of samplebooks where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the samplebooks where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the samplebooks where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of samplebooks
    * @param end the upper bound of the range of samplebooks (not inclusive)
    * @return the range of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the samplebooks where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of samplebooks
    * @param end the upper bound of the range of samplebooks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first samplebook in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Returns the first samplebook in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last samplebook in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Returns the last samplebook in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the samplebooks before and after the current samplebook in the ordered set where groupId = &#63;.
    *
    * @param guestbookId the primary key of the current samplebook
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook[] findByGroupId_PrevAndNext(
        long guestbookId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Removes all the samplebooks where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of samplebooks where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the samplebook in the entity cache if it is enabled.
    *
    * @param samplebook the samplebook
    */
    public void cacheResult(ie.deloitte.sample.model.Samplebook samplebook);

    /**
    * Caches the samplebooks in the entity cache if it is enabled.
    *
    * @param samplebooks the samplebooks
    */
    public void cacheResult(
        java.util.List<ie.deloitte.sample.model.Samplebook> samplebooks);

    /**
    * Creates a new samplebook with the primary key. Does not add the samplebook to the database.
    *
    * @param guestbookId the primary key for the new samplebook
    * @return the new samplebook
    */
    public ie.deloitte.sample.model.Samplebook create(long guestbookId);

    /**
    * Removes the samplebook with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook that was removed
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook remove(long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    public ie.deloitte.sample.model.Samplebook updateImpl(
        ie.deloitte.sample.model.Samplebook samplebook)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the samplebook with the primary key or throws a {@link ie.deloitte.sample.NoSuchSamplebookException} if it could not be found.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook findByPrimaryKey(
        long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException;

    /**
    * Returns the samplebook with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook, or <code>null</code> if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Samplebook fetchByPrimaryKey(
        long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the samplebooks.
    *
    * @return the samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the samplebooks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of samplebooks
    * @param end the upper bound of the range of samplebooks (not inclusive)
    * @return the range of samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the samplebooks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SamplebookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of samplebooks
    * @param end the upper bound of the range of samplebooks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of samplebooks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Samplebook> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the samplebooks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of samplebooks.
    *
    * @return the number of samplebooks
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
