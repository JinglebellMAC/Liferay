package ie.deloitte.sample.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ie.deloitte.sample.model.Sampleentry;

/**
 * The persistence interface for the sampleentry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author JY
 * @see SampleentryPersistenceImpl
 * @see SampleentryUtil
 * @generated
 */
public interface SampleentryPersistence extends BasePersistence<Sampleentry> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SampleentryUtil} to access the sampleentry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the sampleentries where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the sampleentries where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of sampleentries
    * @param end the upper bound of the range of sampleentries (not inclusive)
    * @return the range of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the sampleentries where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of sampleentries
    * @param end the upper bound of the range of sampleentries (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first sampleentry in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Returns the first sampleentry in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last sampleentry in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Returns the last sampleentry in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sampleentries before and after the current sampleentry in the ordered set where uuid = &#63;.
    *
    * @param entryId the primary key of the current sampleentry
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry[] findByUuid_PrevAndNext(
        long entryId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Removes all the sampleentries where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of sampleentries where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sampleentry where uuid = &#63; and groupId = &#63; or throws a {@link ie.deloitte.sample.NoSuchSampleentryException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Returns the sampleentry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sampleentry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the sampleentry where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the sampleentry that was removed
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Returns the number of sampleentries where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the sampleentries where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the sampleentries where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of sampleentries
    * @param end the upper bound of the range of sampleentries (not inclusive)
    * @return the range of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the sampleentries where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of sampleentries
    * @param end the upper bound of the range of sampleentries (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first sampleentry in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Returns the first sampleentry in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last sampleentry in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Returns the last sampleentry in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sampleentries before and after the current sampleentry in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param entryId the primary key of the current sampleentry
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry[] findByUuid_C_PrevAndNext(
        long entryId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Removes all the sampleentries where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of sampleentries where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the sampleentries where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @return the matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findByG_G(
        long groupId, long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the sampleentries where groupId = &#63; and guestbookId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @param start the lower bound of the range of sampleentries
    * @param end the upper bound of the range of sampleentries (not inclusive)
    * @return the range of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findByG_G(
        long groupId, long guestbookId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the sampleentries where groupId = &#63; and guestbookId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @param start the lower bound of the range of sampleentries
    * @param end the upper bound of the range of sampleentries (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findByG_G(
        long groupId, long guestbookId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first sampleentry in the ordered set where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry findByG_G_First(long groupId,
        long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Returns the first sampleentry in the ordered set where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry fetchByG_G_First(long groupId,
        long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last sampleentry in the ordered set where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry findByG_G_Last(long groupId,
        long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Returns the last sampleentry in the ordered set where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry fetchByG_G_Last(long groupId,
        long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sampleentries before and after the current sampleentry in the ordered set where groupId = &#63; and guestbookId = &#63;.
    *
    * @param entryId the primary key of the current sampleentry
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry[] findByG_G_PrevAndNext(
        long entryId, long groupId, long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Removes all the sampleentries where groupId = &#63; and guestbookId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_G(long groupId, long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of sampleentries where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @return the number of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public int countByG_G(long groupId, long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the sampleentry in the entity cache if it is enabled.
    *
    * @param sampleentry the sampleentry
    */
    public void cacheResult(ie.deloitte.sample.model.Sampleentry sampleentry);

    /**
    * Caches the sampleentries in the entity cache if it is enabled.
    *
    * @param sampleentries the sampleentries
    */
    public void cacheResult(
        java.util.List<ie.deloitte.sample.model.Sampleentry> sampleentries);

    /**
    * Creates a new sampleentry with the primary key. Does not add the sampleentry to the database.
    *
    * @param entryId the primary key for the new sampleentry
    * @return the new sampleentry
    */
    public ie.deloitte.sample.model.Sampleentry create(long entryId);

    /**
    * Removes the sampleentry with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entryId the primary key of the sampleentry
    * @return the sampleentry that was removed
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry remove(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    public ie.deloitte.sample.model.Sampleentry updateImpl(
        ie.deloitte.sample.model.Sampleentry sampleentry)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the sampleentry with the primary key or throws a {@link ie.deloitte.sample.NoSuchSampleentryException} if it could not be found.
    *
    * @param entryId the primary key of the sampleentry
    * @return the sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry findByPrimaryKey(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException;

    /**
    * Returns the sampleentry with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entryId the primary key of the sampleentry
    * @return the sampleentry, or <code>null</code> if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ie.deloitte.sample.model.Sampleentry fetchByPrimaryKey(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the sampleentries.
    *
    * @return the sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the sampleentries.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sampleentries
    * @param end the upper bound of the range of sampleentries (not inclusive)
    * @return the range of sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the sampleentries.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ie.deloitte.sample.model.impl.SampleentryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sampleentries
    * @param end the upper bound of the range of sampleentries (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of sampleentries
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ie.deloitte.sample.model.Sampleentry> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the sampleentries from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of sampleentries.
    *
    * @return the number of sampleentries
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
