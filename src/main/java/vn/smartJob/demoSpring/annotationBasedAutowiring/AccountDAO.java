package vn.smartJob.demoSpring.annotationBasedAutowiring;

import java.util.List;

/**
 * Interface dùng để làm khuôn cho các phương thức (method) truy vấn dữ liệu.
 *
 * @author SmartJob
 */
public interface AccountDAO {

    public void insert(Account account);

    public void update(Account account);

    public void update(List<Account> accounts);

    public void delete(long accountId);

    public Account find(long accountId);

    public List<Account> find(List<Long> accountIds);

    public List<Account> find(String ownerName);

    public List<Account> find(boolean locked);

}
