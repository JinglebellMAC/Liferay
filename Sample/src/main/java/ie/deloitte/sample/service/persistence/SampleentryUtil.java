package ie.deloitte.sample.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ie.deloitte.sample.model.Sampleentry;

import java.util.List;

/**
 * The persistence utility for the sampleentry service. This utility wraps {@link SampleentryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author JY
 * @see SampleentryPersistence
 * @see SampleentryPersistenceImpl
 * @generated
 */
public class SampleentryUtil {
    private static SampleentryPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Sampleentry sampleentry) {
        getPersistence().clearCache(sampleentry);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Sampleentry> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Sampleentry> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Sampleentry> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Sampleentry update(Sampleentry sampleentry)
        throws SystemException {
        return getPersistence().update(sampleentry);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Sampleentry update(Sampleentry sampleentry,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(sampleentry, serviceContext);
    }

    /**
    * Returns all the sampleentries where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first sampleentry in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first sampleentry in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last sampleentry in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last sampleentry in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Sampleentry[] findByUuid_PrevAndNext(
        long entryId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence()
                   .findByUuid_PrevAndNext(entryId, uuid, orderByComparator);
    }

    /**
    * Removes all the sampleentries where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of sampleentries where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the sampleentry where uuid = &#63; and groupId = &#63; or throws a {@link ie.deloitte.sample.NoSuchSampleentryException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the sampleentry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the sampleentry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the sampleentry where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the sampleentry that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of sampleentries where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the sampleentries where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Sampleentry findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first sampleentry in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Sampleentry findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last sampleentry in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Sampleentry[] findByUuid_C_PrevAndNext(
        long entryId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(entryId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the sampleentries where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of sampleentries where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the sampleentries where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @return the matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findByG_G(
        long groupId, long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_G(groupId, guestbookId);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findByG_G(
        long groupId, long guestbookId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_G(groupId, guestbookId, start, end);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findByG_G(
        long groupId, long guestbookId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_G(groupId, guestbookId, start, end,
            orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Sampleentry findByG_G_First(
        long groupId, long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence()
                   .findByG_G_First(groupId, guestbookId, orderByComparator);
    }

    /**
    * Returns the first sampleentry in the ordered set where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry fetchByG_G_First(
        long groupId, long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_G_First(groupId, guestbookId, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Sampleentry findByG_G_Last(
        long groupId, long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence()
                   .findByG_G_Last(groupId, guestbookId, orderByComparator);
    }

    /**
    * Returns the last sampleentry in the ordered set where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry fetchByG_G_Last(
        long groupId, long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_G_Last(groupId, guestbookId, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Sampleentry[] findByG_G_PrevAndNext(
        long entryId, long groupId, long guestbookId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence()
                   .findByG_G_PrevAndNext(entryId, groupId, guestbookId,
            orderByComparator);
    }

    /**
    * Removes all the sampleentries where groupId = &#63; and guestbookId = &#63; from the database.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_G(long groupId, long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_G(groupId, guestbookId);
    }

    /**
    * Returns the number of sampleentries where groupId = &#63; and guestbookId = &#63;.
    *
    * @param groupId the group ID
    * @param guestbookId the guestbook ID
    * @return the number of matching sampleentries
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_G(long groupId, long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_G(groupId, guestbookId);
    }

    /**
    * Caches the sampleentry in the entity cache if it is enabled.
    *
    * @param sampleentry the sampleentry
    */
    public static void cacheResult(
        ie.deloitte.sample.model.Sampleentry sampleentry) {
        getPersistence().cacheResult(sampleentry);
    }

    /**
    * Caches the sampleentries in the entity cache if it is enabled.
    *
    * @param sampleentries the sampleentries
    */
    public static void cacheResult(
        java.util.List<ie.deloitte.sample.model.Sampleentry> sampleentries) {
        getPersistence().cacheResult(sampleentries);
    }

    /**
    * Creates a new sampleentry with the primary key. Does not add the sampleentry to the database.
    *
    * @param entryId the primary key for the new sampleentry
    * @return the new sampleentry
    */
    public static ie.deloitte.sample.model.Sampleentry create(long entryId) {
        return getPersistence().create(entryId);
    }

    /**
    * Removes the sampleentry with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entryId the primary key of the sampleentry
    * @return the sampleentry that was removed
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry remove(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence().remove(entryId);
    }

    public static ie.deloitte.sample.model.Sampleentry updateImpl(
        ie.deloitte.sample.model.Sampleentry sampleentry)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(sampleentry);
    }

    /**
    * Returns the sampleentry with the primary key or throws a {@link ie.deloitte.sample.NoSuchSampleentryException} if it could not be found.
    *
    * @param entryId the primary key of the sampleentry
    * @return the sampleentry
    * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry findByPrimaryKey(
        long entryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSampleentryException {
        return getPersistence().findByPrimaryKey(entryId);
    }

    /**
    * Returns the sampleentry with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entryId the primary key of the sampleentry
    * @return the sampleentry, or <code>null</code> if a sampleentry with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Sampleentry fetchByPrimaryKey(
        long entryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entryId);
    }

    /**
    * Returns all the sampleentries.
    *
    * @return the sampleentries
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Sampleentry> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the sampleentries from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of sampleentries.
    *
    * @return the number of sampleentries
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SampleentryPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SampleentryPersistence) PortletBeanLocatorUtil.locate(ie.deloitte.sample.service.ClpSerializer.getServletContextName(),
                    SampleentryPersistence.class.getName());

            ReferenceRegistry.registerReference(SampleentryUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SampleentryPersistence persistence) {
    }
}
