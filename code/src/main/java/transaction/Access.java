package transaction;

import global.AccessType;

/**
 * 事务中的每个操作用Access封装
 */
public class Access {
    private AccessType type;//操作类型
    private Row origRow;
    private Row	data;
    private Row	origData;

}
