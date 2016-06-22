package ie.deloitte.sample.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ie.deloitte.sample.NoSuchSampleentryException;
import ie.deloitte.sample.model.Sampleentry;
import ie.deloitte.sample.model.impl.SampleentryImpl;
import ie.deloitte.sample.model.impl.SampleentryModelImpl;
import ie.deloitte.sample.service.persistence.SampleentryPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the sampleentry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author JY
 * @see SampleentryPersistence
 * @see SampleentryUtil
 * @generated
 */
public class SampleentryPersistenceImpl extends BasePersistenceImpl<Sampleentry>
    implements SampleentryPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SampleentryUtil} to access the sampleentry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SampleentryImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, SampleentryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, SampleentryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, SampleentryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, SampleentryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            SampleentryModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "sampleentry.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "sampleentry.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(sampleentry.uuid IS NULL OR sampleentry.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, SampleentryImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            SampleentryModelImpl.UUID_COLUMN_BITMASK |
            SampleentryModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "sampleentry.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "sampleentry.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(sampleentry.uuid IS NULL OR sampleentry.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "sampleentry.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, SampleentryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, SampleentryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            SampleentryModelImpl.UUID_COLUMN_BITMASK |
            SampleentryModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "sampleentry.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "sampleentry.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(sampleentry.uuid IS NULL OR sampleentry.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "sampleentry.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_G = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, SampleentryImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_G",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, SampleentryImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_G",
            new String[] { Long.class.getName(), Long.class.getName() },
            SampleentryModelImpl.GROUPID_COLUMN_BITMASK |
            SampleentryModelImpl.GUESTBOOKID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_G = new FinderPath(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_G",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_G_G_GROUPID_2 = "sampleentry.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_G_GUESTBOOKID_2 = "sampleentry.guestbookId = ?";
    private static final String _SQL_SELECT_SAMPLEENTRY = "SELECT sampleentry FROM Sampleentry sampleentry";
    private static final String _SQL_SELECT_SAMPLEENTRY_WHERE = "SELECT sampleentry FROM Sampleentry sampleentry WHERE ";
    private static final String _SQL_COUNT_SAMPLEENTRY = "SELECT COUNT(sampleentry) FROM Sampleentry sampleentry";
    private static final String _SQL_COUNT_SAMPLEENTRY_WHERE = "SELECT COUNT(sampleentry) FROM Sampleentry sampleentry WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "sampleentry.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Sampleentry exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Sampleentry exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SampleentryPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Sampleentry _nullSampleentry = new SampleentryImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Sampleentry> toCacheModel() {
                return _nullSampleentryCacheModel;
            }
        };

    private static CacheModel<Sampleentry> _nullSampleentryCacheModel = new CacheModel<Sampleentry>() {
            @Override
            public Sampleentry toEntityModel() {
                return _nullSampleentry;
            }
        };

    public SampleentryPersistenceImpl() {
        setModelClass(Sampleentry.class);
    }

    /**
     * Returns all the sampleentries where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching sampleentries
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sampleentry> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Sampleentry> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
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
    @Override
    public List<Sampleentry> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Sampleentry> list = (List<Sampleentry>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Sampleentry sampleentry : list) {
                if (!Validator.equals(uuid, sampleentry.getUuid())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_SAMPLEENTRY_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SampleentryModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Sampleentry>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sampleentry>(list);
                } else {
                    list = (List<Sampleentry>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Sampleentry findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = fetchByUuid_First(uuid, orderByComparator);

        if (sampleentry != null) {
            return sampleentry;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSampleentryException(msg.toString());
    }

    /**
     * Returns the first sampleentry in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Sampleentry> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Sampleentry findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = fetchByUuid_Last(uuid, orderByComparator);

        if (sampleentry != null) {
            return sampleentry;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSampleentryException(msg.toString());
    }

    /**
     * Returns the last sampleentry in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Sampleentry> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Sampleentry[] findByUuid_PrevAndNext(long entryId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = findByPrimaryKey(entryId);

        Session session = null;

        try {
            session = openSession();

            Sampleentry[] array = new SampleentryImpl[3];

            array[0] = getByUuid_PrevAndNext(session, sampleentry, uuid,
                    orderByComparator, true);

            array[1] = sampleentry;

            array[2] = getByUuid_PrevAndNext(session, sampleentry, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Sampleentry getByUuid_PrevAndNext(Session session,
        Sampleentry sampleentry, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SAMPLEENTRY_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SampleentryModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(sampleentry);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Sampleentry> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the sampleentries where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Sampleentry sampleentry : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(sampleentry);
        }
    }

    /**
     * Returns the number of sampleentries where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching sampleentries
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SAMPLEENTRY_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
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
    @Override
    public Sampleentry findByUUID_G(String uuid, long groupId)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = fetchByUUID_G(uuid, groupId);

        if (sampleentry == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchSampleentryException(msg.toString());
        }

        return sampleentry;
    }

    /**
     * Returns the sampleentry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching sampleentry, or <code>null</code> if a matching sampleentry could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
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
    @Override
    public Sampleentry fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Sampleentry) {
            Sampleentry sampleentry = (Sampleentry) result;

            if (!Validator.equals(uuid, sampleentry.getUuid()) ||
                    (groupId != sampleentry.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_SAMPLEENTRY_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<Sampleentry> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Sampleentry sampleentry = list.get(0);

                    result = sampleentry;

                    cacheResult(sampleentry);

                    if ((sampleentry.getUuid() == null) ||
                            !sampleentry.getUuid().equals(uuid) ||
                            (sampleentry.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, sampleentry);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Sampleentry) result;
        }
    }

    /**
     * Removes the sampleentry where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the sampleentry that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry removeByUUID_G(String uuid, long groupId)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = findByUUID_G(uuid, groupId);

        return remove(sampleentry);
    }

    /**
     * Returns the number of sampleentries where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching sampleentries
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SAMPLEENTRY_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the sampleentries where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching sampleentries
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sampleentry> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Sampleentry> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
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
    @Override
    public List<Sampleentry> findByUuid_C(String uuid, long companyId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<Sampleentry> list = (List<Sampleentry>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Sampleentry sampleentry : list) {
                if (!Validator.equals(uuid, sampleentry.getUuid()) ||
                        (companyId != sampleentry.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_SAMPLEENTRY_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SampleentryModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Sampleentry>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sampleentry>(list);
                } else {
                    list = (List<Sampleentry>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Sampleentry findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (sampleentry != null) {
            return sampleentry;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSampleentryException(msg.toString());
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
    @Override
    public Sampleentry fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Sampleentry> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Sampleentry findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (sampleentry != null) {
            return sampleentry;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSampleentryException(msg.toString());
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
    @Override
    public Sampleentry fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Sampleentry> list = findByUuid_C(uuid, companyId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Sampleentry[] findByUuid_C_PrevAndNext(long entryId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = findByPrimaryKey(entryId);

        Session session = null;

        try {
            session = openSession();

            Sampleentry[] array = new SampleentryImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, sampleentry, uuid,
                    companyId, orderByComparator, true);

            array[1] = sampleentry;

            array[2] = getByUuid_C_PrevAndNext(session, sampleentry, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Sampleentry getByUuid_C_PrevAndNext(Session session,
        Sampleentry sampleentry, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SAMPLEENTRY_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SampleentryModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(sampleentry);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Sampleentry> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the sampleentries where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Sampleentry sampleentry : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(sampleentry);
        }
    }

    /**
     * Returns the number of sampleentries where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching sampleentries
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SAMPLEENTRY_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the sampleentries where groupId = &#63; and guestbookId = &#63;.
     *
     * @param groupId the group ID
     * @param guestbookId the guestbook ID
     * @return the matching sampleentries
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sampleentry> findByG_G(long groupId, long guestbookId)
        throws SystemException {
        return findByG_G(groupId, guestbookId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Sampleentry> findByG_G(long groupId, long guestbookId,
        int start, int end) throws SystemException {
        return findByG_G(groupId, guestbookId, start, end, null);
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
    @Override
    public List<Sampleentry> findByG_G(long groupId, long guestbookId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G;
            finderArgs = new Object[] { groupId, guestbookId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_G;
            finderArgs = new Object[] {
                    groupId, guestbookId,
                    
                    start, end, orderByComparator
                };
        }

        List<Sampleentry> list = (List<Sampleentry>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Sampleentry sampleentry : list) {
                if ((groupId != sampleentry.getGroupId()) ||
                        (guestbookId != sampleentry.getGuestbookId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_SAMPLEENTRY_WHERE);

            query.append(_FINDER_COLUMN_G_G_GROUPID_2);

            query.append(_FINDER_COLUMN_G_G_GUESTBOOKID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SampleentryModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(guestbookId);

                if (!pagination) {
                    list = (List<Sampleentry>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sampleentry>(list);
                } else {
                    list = (List<Sampleentry>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Sampleentry findByG_G_First(long groupId, long guestbookId,
        OrderByComparator orderByComparator)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = fetchByG_G_First(groupId, guestbookId,
                orderByComparator);

        if (sampleentry != null) {
            return sampleentry;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", guestbookId=");
        msg.append(guestbookId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSampleentryException(msg.toString());
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
    @Override
    public Sampleentry fetchByG_G_First(long groupId, long guestbookId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Sampleentry> list = findByG_G(groupId, guestbookId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Sampleentry findByG_G_Last(long groupId, long guestbookId,
        OrderByComparator orderByComparator)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = fetchByG_G_Last(groupId, guestbookId,
                orderByComparator);

        if (sampleentry != null) {
            return sampleentry;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", guestbookId=");
        msg.append(guestbookId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSampleentryException(msg.toString());
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
    @Override
    public Sampleentry fetchByG_G_Last(long groupId, long guestbookId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_G(groupId, guestbookId);

        if (count == 0) {
            return null;
        }

        List<Sampleentry> list = findByG_G(groupId, guestbookId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Sampleentry[] findByG_G_PrevAndNext(long entryId, long groupId,
        long guestbookId, OrderByComparator orderByComparator)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = findByPrimaryKey(entryId);

        Session session = null;

        try {
            session = openSession();

            Sampleentry[] array = new SampleentryImpl[3];

            array[0] = getByG_G_PrevAndNext(session, sampleentry, groupId,
                    guestbookId, orderByComparator, true);

            array[1] = sampleentry;

            array[2] = getByG_G_PrevAndNext(session, sampleentry, groupId,
                    guestbookId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Sampleentry getByG_G_PrevAndNext(Session session,
        Sampleentry sampleentry, long groupId, long guestbookId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SAMPLEENTRY_WHERE);

        query.append(_FINDER_COLUMN_G_G_GROUPID_2);

        query.append(_FINDER_COLUMN_G_G_GUESTBOOKID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(SampleentryModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(guestbookId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(sampleentry);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Sampleentry> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the sampleentries where groupId = &#63; and guestbookId = &#63; from the database.
     *
     * @param groupId the group ID
     * @param guestbookId the guestbook ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_G(long groupId, long guestbookId)
        throws SystemException {
        for (Sampleentry sampleentry : findByG_G(groupId, guestbookId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(sampleentry);
        }
    }

    /**
     * Returns the number of sampleentries where groupId = &#63; and guestbookId = &#63;.
     *
     * @param groupId the group ID
     * @param guestbookId the guestbook ID
     * @return the number of matching sampleentries
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_G(long groupId, long guestbookId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_G;

        Object[] finderArgs = new Object[] { groupId, guestbookId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_SAMPLEENTRY_WHERE);

            query.append(_FINDER_COLUMN_G_G_GROUPID_2);

            query.append(_FINDER_COLUMN_G_G_GUESTBOOKID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(guestbookId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the sampleentry in the entity cache if it is enabled.
     *
     * @param sampleentry the sampleentry
     */
    @Override
    public void cacheResult(Sampleentry sampleentry) {
        EntityCacheUtil.putResult(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryImpl.class, sampleentry.getPrimaryKey(), sampleentry);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { sampleentry.getUuid(), sampleentry.getGroupId() },
            sampleentry);

        sampleentry.resetOriginalValues();
    }

    /**
     * Caches the sampleentries in the entity cache if it is enabled.
     *
     * @param sampleentries the sampleentries
     */
    @Override
    public void cacheResult(List<Sampleentry> sampleentries) {
        for (Sampleentry sampleentry : sampleentries) {
            if (EntityCacheUtil.getResult(
                        SampleentryModelImpl.ENTITY_CACHE_ENABLED,
                        SampleentryImpl.class, sampleentry.getPrimaryKey()) == null) {
                cacheResult(sampleentry);
            } else {
                sampleentry.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all sampleentries.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SampleentryImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SampleentryImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the sampleentry.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Sampleentry sampleentry) {
        EntityCacheUtil.removeResult(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryImpl.class, sampleentry.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(sampleentry);
    }

    @Override
    public void clearCache(List<Sampleentry> sampleentries) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Sampleentry sampleentry : sampleentries) {
            EntityCacheUtil.removeResult(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
                SampleentryImpl.class, sampleentry.getPrimaryKey());

            clearUniqueFindersCache(sampleentry);
        }
    }

    protected void cacheUniqueFindersCache(Sampleentry sampleentry) {
        if (sampleentry.isNew()) {
            Object[] args = new Object[] {
                    sampleentry.getUuid(), sampleentry.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                sampleentry);
        } else {
            SampleentryModelImpl sampleentryModelImpl = (SampleentryModelImpl) sampleentry;

            if ((sampleentryModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        sampleentry.getUuid(), sampleentry.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    sampleentry);
            }
        }
    }

    protected void clearUniqueFindersCache(Sampleentry sampleentry) {
        SampleentryModelImpl sampleentryModelImpl = (SampleentryModelImpl) sampleentry;

        Object[] args = new Object[] {
                sampleentry.getUuid(), sampleentry.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((sampleentryModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    sampleentryModelImpl.getOriginalUuid(),
                    sampleentryModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new sampleentry with the primary key. Does not add the sampleentry to the database.
     *
     * @param entryId the primary key for the new sampleentry
     * @return the new sampleentry
     */
    @Override
    public Sampleentry create(long entryId) {
        Sampleentry sampleentry = new SampleentryImpl();

        sampleentry.setNew(true);
        sampleentry.setPrimaryKey(entryId);

        String uuid = PortalUUIDUtil.generate();

        sampleentry.setUuid(uuid);

        return sampleentry;
    }

    /**
     * Removes the sampleentry with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entryId the primary key of the sampleentry
     * @return the sampleentry that was removed
     * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry remove(long entryId)
        throws NoSuchSampleentryException, SystemException {
        return remove((Serializable) entryId);
    }

    /**
     * Removes the sampleentry with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the sampleentry
     * @return the sampleentry that was removed
     * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry remove(Serializable primaryKey)
        throws NoSuchSampleentryException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Sampleentry sampleentry = (Sampleentry) session.get(SampleentryImpl.class,
                    primaryKey);

            if (sampleentry == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSampleentryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(sampleentry);
        } catch (NoSuchSampleentryException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Sampleentry removeImpl(Sampleentry sampleentry)
        throws SystemException {
        sampleentry = toUnwrappedModel(sampleentry);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(sampleentry)) {
                sampleentry = (Sampleentry) session.get(SampleentryImpl.class,
                        sampleentry.getPrimaryKeyObj());
            }

            if (sampleentry != null) {
                session.delete(sampleentry);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (sampleentry != null) {
            clearCache(sampleentry);
        }

        return sampleentry;
    }

    @Override
    public Sampleentry updateImpl(
        ie.deloitte.sample.model.Sampleentry sampleentry)
        throws SystemException {
        sampleentry = toUnwrappedModel(sampleentry);

        boolean isNew = sampleentry.isNew();

        SampleentryModelImpl sampleentryModelImpl = (SampleentryModelImpl) sampleentry;

        if (Validator.isNull(sampleentry.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            sampleentry.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (sampleentry.isNew()) {
                session.save(sampleentry);

                sampleentry.setNew(false);
            } else {
                session.merge(sampleentry);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SampleentryModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((sampleentryModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        sampleentryModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { sampleentryModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((sampleentryModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        sampleentryModelImpl.getOriginalUuid(),
                        sampleentryModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        sampleentryModelImpl.getUuid(),
                        sampleentryModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((sampleentryModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        sampleentryModelImpl.getOriginalGroupId(),
                        sampleentryModelImpl.getOriginalGuestbookId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
                    args);

                args = new Object[] {
                        sampleentryModelImpl.getGroupId(),
                        sampleentryModelImpl.getGuestbookId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_G, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_G,
                    args);
            }
        }

        EntityCacheUtil.putResult(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
            SampleentryImpl.class, sampleentry.getPrimaryKey(), sampleentry);

        clearUniqueFindersCache(sampleentry);
        cacheUniqueFindersCache(sampleentry);

        return sampleentry;
    }

    protected Sampleentry toUnwrappedModel(Sampleentry sampleentry) {
        if (sampleentry instanceof SampleentryImpl) {
            return sampleentry;
        }

        SampleentryImpl sampleentryImpl = new SampleentryImpl();

        sampleentryImpl.setNew(sampleentry.isNew());
        sampleentryImpl.setPrimaryKey(sampleentry.getPrimaryKey());

        sampleentryImpl.setUuid(sampleentry.getUuid());
        sampleentryImpl.setEntryId(sampleentry.getEntryId());
        sampleentryImpl.setGroupId(sampleentry.getGroupId());
        sampleentryImpl.setCompanyId(sampleentry.getCompanyId());
        sampleentryImpl.setUserId(sampleentry.getUserId());
        sampleentryImpl.setUserName(sampleentry.getUserName());
        sampleentryImpl.setCreateDate(sampleentry.getCreateDate());
        sampleentryImpl.setModifiedDate(sampleentry.getModifiedDate());
        sampleentryImpl.setName(sampleentry.getName());
        sampleentryImpl.setMessage(sampleentry.getMessage());
        sampleentryImpl.setEmail(sampleentry.getEmail());
        sampleentryImpl.setGuestbookId(sampleentry.getGuestbookId());

        return sampleentryImpl;
    }

    /**
     * Returns the sampleentry with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the sampleentry
     * @return the sampleentry
     * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSampleentryException, SystemException {
        Sampleentry sampleentry = fetchByPrimaryKey(primaryKey);

        if (sampleentry == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSampleentryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return sampleentry;
    }

    /**
     * Returns the sampleentry with the primary key or throws a {@link ie.deloitte.sample.NoSuchSampleentryException} if it could not be found.
     *
     * @param entryId the primary key of the sampleentry
     * @return the sampleentry
     * @throws ie.deloitte.sample.NoSuchSampleentryException if a sampleentry with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry findByPrimaryKey(long entryId)
        throws NoSuchSampleentryException, SystemException {
        return findByPrimaryKey((Serializable) entryId);
    }

    /**
     * Returns the sampleentry with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the sampleentry
     * @return the sampleentry, or <code>null</code> if a sampleentry with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Sampleentry sampleentry = (Sampleentry) EntityCacheUtil.getResult(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
                SampleentryImpl.class, primaryKey);

        if (sampleentry == _nullSampleentry) {
            return null;
        }

        if (sampleentry == null) {
            Session session = null;

            try {
                session = openSession();

                sampleentry = (Sampleentry) session.get(SampleentryImpl.class,
                        primaryKey);

                if (sampleentry != null) {
                    cacheResult(sampleentry);
                } else {
                    EntityCacheUtil.putResult(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
                        SampleentryImpl.class, primaryKey, _nullSampleentry);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SampleentryModelImpl.ENTITY_CACHE_ENABLED,
                    SampleentryImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return sampleentry;
    }

    /**
     * Returns the sampleentry with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entryId the primary key of the sampleentry
     * @return the sampleentry, or <code>null</code> if a sampleentry with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Sampleentry fetchByPrimaryKey(long entryId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) entryId);
    }

    /**
     * Returns all the sampleentries.
     *
     * @return the sampleentries
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Sampleentry> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Sampleentry> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Sampleentry> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Sampleentry> list = (List<Sampleentry>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SAMPLEENTRY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SAMPLEENTRY;

                if (pagination) {
                    sql = sql.concat(SampleentryModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Sampleentry>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Sampleentry>(list);
                } else {
                    list = (List<Sampleentry>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the sampleentries from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Sampleentry sampleentry : findAll()) {
            remove(sampleentry);
        }
    }

    /**
     * Returns the number of sampleentries.
     *
     * @return the number of sampleentries
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_SAMPLEENTRY);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the sampleentry persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ie.deloitte.sample.model.Sampleentry")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Sampleentry>> listenersList = new ArrayList<ModelListener<Sampleentry>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Sampleentry>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SampleentryImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
