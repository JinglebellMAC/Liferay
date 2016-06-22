package ie.deloitte.sample.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ie.deloitte.sample.model.Samplebook;

import java.util.List;

/**
 * The persistence utility for the samplebook service. This utility wraps {@link SamplebookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author JY
 * @see SamplebookPersistence
 * @see SamplebookPersistenceImpl
 * @generated
 */
public class SamplebookUtil {
    private static SamplebookPersistence _persistence;

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
    public static void clearCache(Samplebook samplebook) {
        getPersistence().clearCache(samplebook);
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
    public static List<Samplebook> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Samplebook> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Samplebook> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Samplebook update(Samplebook samplebook)
        throws SystemException {
        return getPersistence().update(samplebook);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Samplebook update(Samplebook samplebook,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(samplebook, serviceContext);
    }

    /**
    * Returns all the samplebooks where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first samplebook in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first samplebook in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last samplebook in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last samplebook in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Samplebook[] findByUuid_PrevAndNext(
        long guestbookId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence()
                   .findByUuid_PrevAndNext(guestbookId, uuid, orderByComparator);
    }

    /**
    * Removes all the samplebooks where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of samplebooks where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the samplebook where uuid = &#63; and groupId = &#63; or throws a {@link ie.deloitte.sample.NoSuchSamplebookException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the samplebook where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the samplebook where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the samplebook where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the samplebook that was removed
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of samplebooks where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the samplebooks where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Samplebook findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first samplebook in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Samplebook findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last samplebook in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Samplebook[] findByUuid_C_PrevAndNext(
        long guestbookId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(guestbookId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the samplebooks where uuid = &#63; and companyId = &#63; from the database.
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
    * Returns the number of samplebooks where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the samplebooks where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first samplebook in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first samplebook in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last samplebook in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last samplebook in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching samplebook, or <code>null</code> if a matching samplebook could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

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
    public static ie.deloitte.sample.model.Samplebook[] findByGroupId_PrevAndNext(
        long guestbookId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(guestbookId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the samplebooks where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of samplebooks where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Caches the samplebook in the entity cache if it is enabled.
    *
    * @param samplebook the samplebook
    */
    public static void cacheResult(
        ie.deloitte.sample.model.Samplebook samplebook) {
        getPersistence().cacheResult(samplebook);
    }

    /**
    * Caches the samplebooks in the entity cache if it is enabled.
    *
    * @param samplebooks the samplebooks
    */
    public static void cacheResult(
        java.util.List<ie.deloitte.sample.model.Samplebook> samplebooks) {
        getPersistence().cacheResult(samplebooks);
    }

    /**
    * Creates a new samplebook with the primary key. Does not add the samplebook to the database.
    *
    * @param guestbookId the primary key for the new samplebook
    * @return the new samplebook
    */
    public static ie.deloitte.sample.model.Samplebook create(long guestbookId) {
        return getPersistence().create(guestbookId);
    }

    /**
    * Removes the samplebook with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook that was removed
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook remove(long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence().remove(guestbookId);
    }

    public static ie.deloitte.sample.model.Samplebook updateImpl(
        ie.deloitte.sample.model.Samplebook samplebook)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(samplebook);
    }

    /**
    * Returns the samplebook with the primary key or throws a {@link ie.deloitte.sample.NoSuchSamplebookException} if it could not be found.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook
    * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook findByPrimaryKey(
        long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException,
            ie.deloitte.sample.NoSuchSamplebookException {
        return getPersistence().findByPrimaryKey(guestbookId);
    }

    /**
    * Returns the samplebook with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param guestbookId the primary key of the samplebook
    * @return the samplebook, or <code>null</code> if a samplebook with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ie.deloitte.sample.model.Samplebook fetchByPrimaryKey(
        long guestbookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(guestbookId);
    }

    /**
    * Returns all the samplebooks.
    *
    * @return the samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<ie.deloitte.sample.model.Samplebook> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the samplebooks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of samplebooks.
    *
    * @return the number of samplebooks
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SamplebookPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SamplebookPersistence) PortletBeanLocatorUtil.locate(ie.deloitte.sample.service.ClpSerializer.getServletContextName(),
                    SamplebookPersistence.class.getName());

            ReferenceRegistry.registerReference(SamplebookUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SamplebookPersistence persistence) {
    }
}
