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

import ie.deloitte.sample.NoSuchSamplebookException;
import ie.deloitte.sample.model.Samplebook;
import ie.deloitte.sample.model.impl.SamplebookImpl;
import ie.deloitte.sample.model.impl.SamplebookModelImpl;
import ie.deloitte.sample.service.persistence.SamplebookPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the samplebook service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author JY
 * @see SamplebookPersistence
 * @see SamplebookUtil
 * @generated
 */
public class SamplebookPersistenceImpl extends BasePersistenceImpl<Samplebook>
    implements SamplebookPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link SamplebookUtil} to access the samplebook persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = SamplebookImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, SamplebookImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, SamplebookImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, SamplebookImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, SamplebookImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            SamplebookModelImpl.UUID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "samplebook.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "samplebook.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(samplebook.uuid IS NULL OR samplebook.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, SamplebookImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            SamplebookModelImpl.UUID_COLUMN_BITMASK |
            SamplebookModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "samplebook.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "samplebook.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(samplebook.uuid IS NULL OR samplebook.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "samplebook.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, SamplebookImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, SamplebookImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            SamplebookModelImpl.UUID_COLUMN_BITMASK |
            SamplebookModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "samplebook.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "samplebook.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(samplebook.uuid IS NULL OR samplebook.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "samplebook.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, SamplebookImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, SamplebookImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            SamplebookModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "samplebook.groupId = ?";
    private static final String _SQL_SELECT_SAMPLEBOOK = "SELECT samplebook FROM Samplebook samplebook";
    private static final String _SQL_SELECT_SAMPLEBOOK_WHERE = "SELECT samplebook FROM Samplebook samplebook WHERE ";
    private static final String _SQL_COUNT_SAMPLEBOOK = "SELECT COUNT(samplebook) FROM Samplebook samplebook";
    private static final String _SQL_COUNT_SAMPLEBOOK_WHERE = "SELECT COUNT(samplebook) FROM Samplebook samplebook WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "samplebook.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Samplebook exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Samplebook exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(SamplebookPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Samplebook _nullSamplebook = new SamplebookImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Samplebook> toCacheModel() {
                return _nullSamplebookCacheModel;
            }
        };

    private static CacheModel<Samplebook> _nullSamplebookCacheModel = new CacheModel<Samplebook>() {
            @Override
            public Samplebook toEntityModel() {
                return _nullSamplebook;
            }
        };

    public SamplebookPersistenceImpl() {
        setModelClass(Samplebook.class);
    }

    /**
     * Returns all the samplebooks where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching samplebooks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Samplebook> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Samplebook> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
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
    @Override
    public List<Samplebook> findByUuid(String uuid, int start, int end,
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

        List<Samplebook> list = (List<Samplebook>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Samplebook samplebook : list) {
                if (!Validator.equals(uuid, samplebook.getUuid())) {
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

            query.append(_SQL_SELECT_SAMPLEBOOK_WHERE);

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
                query.append(SamplebookModelImpl.ORDER_BY_JPQL);
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
                    list = (List<Samplebook>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Samplebook>(list);
                } else {
                    list = (List<Samplebook>) QueryUtil.list(q, getDialect(),
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
     * Returns the first samplebook in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching samplebook
     * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = fetchByUuid_First(uuid, orderByComparator);

        if (samplebook != null) {
            return samplebook;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSamplebookException(msg.toString());
    }

    /**
     * Returns the first samplebook in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching samplebook, or <code>null</code> if a matching samplebook could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Samplebook> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Samplebook findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = fetchByUuid_Last(uuid, orderByComparator);

        if (samplebook != null) {
            return samplebook;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSamplebookException(msg.toString());
    }

    /**
     * Returns the last samplebook in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching samplebook, or <code>null</code> if a matching samplebook could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Samplebook> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Samplebook[] findByUuid_PrevAndNext(long guestbookId, String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = findByPrimaryKey(guestbookId);

        Session session = null;

        try {
            session = openSession();

            Samplebook[] array = new SamplebookImpl[3];

            array[0] = getByUuid_PrevAndNext(session, samplebook, uuid,
                    orderByComparator, true);

            array[1] = samplebook;

            array[2] = getByUuid_PrevAndNext(session, samplebook, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Samplebook getByUuid_PrevAndNext(Session session,
        Samplebook samplebook, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SAMPLEBOOK_WHERE);

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
            query.append(SamplebookModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(samplebook);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Samplebook> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the samplebooks where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Samplebook samplebook : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(samplebook);
        }
    }

    /**
     * Returns the number of samplebooks where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching samplebooks
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

            query.append(_SQL_COUNT_SAMPLEBOOK_WHERE);

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
     * Returns the samplebook where uuid = &#63; and groupId = &#63; or throws a {@link ie.deloitte.sample.NoSuchSamplebookException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching samplebook
     * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook findByUUID_G(String uuid, long groupId)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = fetchByUUID_G(uuid, groupId);

        if (samplebook == null) {
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

            throw new NoSuchSamplebookException(msg.toString());
        }

        return samplebook;
    }

    /**
     * Returns the samplebook where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching samplebook, or <code>null</code> if a matching samplebook could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
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
    @Override
    public Samplebook fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Samplebook) {
            Samplebook samplebook = (Samplebook) result;

            if (!Validator.equals(uuid, samplebook.getUuid()) ||
                    (groupId != samplebook.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_SAMPLEBOOK_WHERE);

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

                List<Samplebook> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Samplebook samplebook = list.get(0);

                    result = samplebook;

                    cacheResult(samplebook);

                    if ((samplebook.getUuid() == null) ||
                            !samplebook.getUuid().equals(uuid) ||
                            (samplebook.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, samplebook);
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
            return (Samplebook) result;
        }
    }

    /**
     * Removes the samplebook where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the samplebook that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook removeByUUID_G(String uuid, long groupId)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = findByUUID_G(uuid, groupId);

        return remove(samplebook);
    }

    /**
     * Returns the number of samplebooks where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching samplebooks
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

            query.append(_SQL_COUNT_SAMPLEBOOK_WHERE);

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
     * Returns all the samplebooks where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching samplebooks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Samplebook> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Samplebook> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
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
    @Override
    public List<Samplebook> findByUuid_C(String uuid, long companyId,
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

        List<Samplebook> list = (List<Samplebook>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Samplebook samplebook : list) {
                if (!Validator.equals(uuid, samplebook.getUuid()) ||
                        (companyId != samplebook.getCompanyId())) {
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

            query.append(_SQL_SELECT_SAMPLEBOOK_WHERE);

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
                query.append(SamplebookModelImpl.ORDER_BY_JPQL);
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
                    list = (List<Samplebook>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Samplebook>(list);
                } else {
                    list = (List<Samplebook>) QueryUtil.list(q, getDialect(),
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
     * Returns the first samplebook in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching samplebook
     * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (samplebook != null) {
            return samplebook;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSamplebookException(msg.toString());
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
    @Override
    public Samplebook fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Samplebook> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Samplebook findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (samplebook != null) {
            return samplebook;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSamplebookException(msg.toString());
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
    @Override
    public Samplebook fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Samplebook> list = findByUuid_C(uuid, companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Samplebook[] findByUuid_C_PrevAndNext(long guestbookId, String uuid,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = findByPrimaryKey(guestbookId);

        Session session = null;

        try {
            session = openSession();

            Samplebook[] array = new SamplebookImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, samplebook, uuid,
                    companyId, orderByComparator, true);

            array[1] = samplebook;

            array[2] = getByUuid_C_PrevAndNext(session, samplebook, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Samplebook getByUuid_C_PrevAndNext(Session session,
        Samplebook samplebook, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SAMPLEBOOK_WHERE);

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
            query.append(SamplebookModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(samplebook);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Samplebook> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the samplebooks where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Samplebook samplebook : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(samplebook);
        }
    }

    /**
     * Returns the number of samplebooks where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching samplebooks
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

            query.append(_SQL_COUNT_SAMPLEBOOK_WHERE);

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
     * Returns all the samplebooks where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching samplebooks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Samplebook> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Samplebook> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
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
    @Override
    public List<Samplebook> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<Samplebook> list = (List<Samplebook>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Samplebook samplebook : list) {
                if ((groupId != samplebook.getGroupId())) {
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

            query.append(_SQL_SELECT_SAMPLEBOOK_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(SamplebookModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<Samplebook>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Samplebook>(list);
                } else {
                    list = (List<Samplebook>) QueryUtil.list(q, getDialect(),
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
     * Returns the first samplebook in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching samplebook
     * @throws ie.deloitte.sample.NoSuchSamplebookException if a matching samplebook could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = fetchByGroupId_First(groupId, orderByComparator);

        if (samplebook != null) {
            return samplebook;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSamplebookException(msg.toString());
    }

    /**
     * Returns the first samplebook in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching samplebook, or <code>null</code> if a matching samplebook could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Samplebook> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Samplebook findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = fetchByGroupId_Last(groupId, orderByComparator);

        if (samplebook != null) {
            return samplebook;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchSamplebookException(msg.toString());
    }

    /**
     * Returns the last samplebook in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching samplebook, or <code>null</code> if a matching samplebook could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<Samplebook> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Samplebook[] findByGroupId_PrevAndNext(long guestbookId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = findByPrimaryKey(guestbookId);

        Session session = null;

        try {
            session = openSession();

            Samplebook[] array = new SamplebookImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, samplebook, groupId,
                    orderByComparator, true);

            array[1] = samplebook;

            array[2] = getByGroupId_PrevAndNext(session, samplebook, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Samplebook getByGroupId_PrevAndNext(Session session,
        Samplebook samplebook, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_SAMPLEBOOK_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
            query.append(SamplebookModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(samplebook);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Samplebook> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the samplebooks where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (Samplebook samplebook : findByGroupId(groupId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(samplebook);
        }
    }

    /**
     * Returns the number of samplebooks where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching samplebooks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_SAMPLEBOOK_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

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
     * Caches the samplebook in the entity cache if it is enabled.
     *
     * @param samplebook the samplebook
     */
    @Override
    public void cacheResult(Samplebook samplebook) {
        EntityCacheUtil.putResult(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookImpl.class, samplebook.getPrimaryKey(), samplebook);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { samplebook.getUuid(), samplebook.getGroupId() },
            samplebook);

        samplebook.resetOriginalValues();
    }

    /**
     * Caches the samplebooks in the entity cache if it is enabled.
     *
     * @param samplebooks the samplebooks
     */
    @Override
    public void cacheResult(List<Samplebook> samplebooks) {
        for (Samplebook samplebook : samplebooks) {
            if (EntityCacheUtil.getResult(
                        SamplebookModelImpl.ENTITY_CACHE_ENABLED,
                        SamplebookImpl.class, samplebook.getPrimaryKey()) == null) {
                cacheResult(samplebook);
            } else {
                samplebook.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all samplebooks.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(SamplebookImpl.class.getName());
        }

        EntityCacheUtil.clearCache(SamplebookImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the samplebook.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Samplebook samplebook) {
        EntityCacheUtil.removeResult(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookImpl.class, samplebook.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(samplebook);
    }

    @Override
    public void clearCache(List<Samplebook> samplebooks) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Samplebook samplebook : samplebooks) {
            EntityCacheUtil.removeResult(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
                SamplebookImpl.class, samplebook.getPrimaryKey());

            clearUniqueFindersCache(samplebook);
        }
    }

    protected void cacheUniqueFindersCache(Samplebook samplebook) {
        if (samplebook.isNew()) {
            Object[] args = new Object[] {
                    samplebook.getUuid(), samplebook.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                samplebook);
        } else {
            SamplebookModelImpl samplebookModelImpl = (SamplebookModelImpl) samplebook;

            if ((samplebookModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        samplebook.getUuid(), samplebook.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    samplebook);
            }
        }
    }

    protected void clearUniqueFindersCache(Samplebook samplebook) {
        SamplebookModelImpl samplebookModelImpl = (SamplebookModelImpl) samplebook;

        Object[] args = new Object[] {
                samplebook.getUuid(), samplebook.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((samplebookModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    samplebookModelImpl.getOriginalUuid(),
                    samplebookModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new samplebook with the primary key. Does not add the samplebook to the database.
     *
     * @param guestbookId the primary key for the new samplebook
     * @return the new samplebook
     */
    @Override
    public Samplebook create(long guestbookId) {
        Samplebook samplebook = new SamplebookImpl();

        samplebook.setNew(true);
        samplebook.setPrimaryKey(guestbookId);

        String uuid = PortalUUIDUtil.generate();

        samplebook.setUuid(uuid);

        return samplebook;
    }

    /**
     * Removes the samplebook with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param guestbookId the primary key of the samplebook
     * @return the samplebook that was removed
     * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook remove(long guestbookId)
        throws NoSuchSamplebookException, SystemException {
        return remove((Serializable) guestbookId);
    }

    /**
     * Removes the samplebook with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the samplebook
     * @return the samplebook that was removed
     * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook remove(Serializable primaryKey)
        throws NoSuchSamplebookException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Samplebook samplebook = (Samplebook) session.get(SamplebookImpl.class,
                    primaryKey);

            if (samplebook == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchSamplebookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(samplebook);
        } catch (NoSuchSamplebookException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Samplebook removeImpl(Samplebook samplebook)
        throws SystemException {
        samplebook = toUnwrappedModel(samplebook);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(samplebook)) {
                samplebook = (Samplebook) session.get(SamplebookImpl.class,
                        samplebook.getPrimaryKeyObj());
            }

            if (samplebook != null) {
                session.delete(samplebook);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (samplebook != null) {
            clearCache(samplebook);
        }

        return samplebook;
    }

    @Override
    public Samplebook updateImpl(ie.deloitte.sample.model.Samplebook samplebook)
        throws SystemException {
        samplebook = toUnwrappedModel(samplebook);

        boolean isNew = samplebook.isNew();

        SamplebookModelImpl samplebookModelImpl = (SamplebookModelImpl) samplebook;

        if (Validator.isNull(samplebook.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            samplebook.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (samplebook.isNew()) {
                session.save(samplebook);

                samplebook.setNew(false);
            } else {
                session.merge(samplebook);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !SamplebookModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((samplebookModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        samplebookModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { samplebookModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((samplebookModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        samplebookModelImpl.getOriginalUuid(),
                        samplebookModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        samplebookModelImpl.getUuid(),
                        samplebookModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((samplebookModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        samplebookModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { samplebookModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }
        }

        EntityCacheUtil.putResult(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
            SamplebookImpl.class, samplebook.getPrimaryKey(), samplebook);

        clearUniqueFindersCache(samplebook);
        cacheUniqueFindersCache(samplebook);

        return samplebook;
    }

    protected Samplebook toUnwrappedModel(Samplebook samplebook) {
        if (samplebook instanceof SamplebookImpl) {
            return samplebook;
        }

        SamplebookImpl samplebookImpl = new SamplebookImpl();

        samplebookImpl.setNew(samplebook.isNew());
        samplebookImpl.setPrimaryKey(samplebook.getPrimaryKey());

        samplebookImpl.setUuid(samplebook.getUuid());
        samplebookImpl.setGuestbookId(samplebook.getGuestbookId());
        samplebookImpl.setGroupId(samplebook.getGroupId());
        samplebookImpl.setCompanyId(samplebook.getCompanyId());
        samplebookImpl.setUserId(samplebook.getUserId());
        samplebookImpl.setUserName(samplebook.getUserName());
        samplebookImpl.setCreateDate(samplebook.getCreateDate());
        samplebookImpl.setModifiedDate(samplebook.getModifiedDate());
        samplebookImpl.setName(samplebook.getName());

        return samplebookImpl;
    }

    /**
     * Returns the samplebook with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the samplebook
     * @return the samplebook
     * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook findByPrimaryKey(Serializable primaryKey)
        throws NoSuchSamplebookException, SystemException {
        Samplebook samplebook = fetchByPrimaryKey(primaryKey);

        if (samplebook == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchSamplebookException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return samplebook;
    }

    /**
     * Returns the samplebook with the primary key or throws a {@link ie.deloitte.sample.NoSuchSamplebookException} if it could not be found.
     *
     * @param guestbookId the primary key of the samplebook
     * @return the samplebook
     * @throws ie.deloitte.sample.NoSuchSamplebookException if a samplebook with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook findByPrimaryKey(long guestbookId)
        throws NoSuchSamplebookException, SystemException {
        return findByPrimaryKey((Serializable) guestbookId);
    }

    /**
     * Returns the samplebook with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the samplebook
     * @return the samplebook, or <code>null</code> if a samplebook with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Samplebook samplebook = (Samplebook) EntityCacheUtil.getResult(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
                SamplebookImpl.class, primaryKey);

        if (samplebook == _nullSamplebook) {
            return null;
        }

        if (samplebook == null) {
            Session session = null;

            try {
                session = openSession();

                samplebook = (Samplebook) session.get(SamplebookImpl.class,
                        primaryKey);

                if (samplebook != null) {
                    cacheResult(samplebook);
                } else {
                    EntityCacheUtil.putResult(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
                        SamplebookImpl.class, primaryKey, _nullSamplebook);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(SamplebookModelImpl.ENTITY_CACHE_ENABLED,
                    SamplebookImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return samplebook;
    }

    /**
     * Returns the samplebook with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param guestbookId the primary key of the samplebook
     * @return the samplebook, or <code>null</code> if a samplebook with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Samplebook fetchByPrimaryKey(long guestbookId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) guestbookId);
    }

    /**
     * Returns all the samplebooks.
     *
     * @return the samplebooks
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Samplebook> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Samplebook> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Samplebook> findAll(int start, int end,
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

        List<Samplebook> list = (List<Samplebook>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_SAMPLEBOOK);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_SAMPLEBOOK;

                if (pagination) {
                    sql = sql.concat(SamplebookModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Samplebook>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Samplebook>(list);
                } else {
                    list = (List<Samplebook>) QueryUtil.list(q, getDialect(),
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
     * Removes all the samplebooks from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Samplebook samplebook : findAll()) {
            remove(samplebook);
        }
    }

    /**
     * Returns the number of samplebooks.
     *
     * @return the number of samplebooks
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

                Query q = session.createQuery(_SQL_COUNT_SAMPLEBOOK);

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
     * Initializes the samplebook persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ie.deloitte.sample.model.Samplebook")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Samplebook>> listenersList = new ArrayList<ModelListener<Samplebook>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Samplebook>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(SamplebookImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
