package cn.dksy.domain;

/**
 * @author JAVASM
 * @title: CustomerVo
 * @projectName ssm_diy
 * @description: TODO
 * @date 2019/8/23 0:03
 */
public class CustomerVo {
    private Customer customer;
    private String currentPage;
    private String pageSize;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public CustomerVo(Customer customer, String currentPage, String pageSize) {
        this.customer = customer;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public CustomerVo() {
    }

    @Override
    public String toString() {
        return "CustomerVo{" +
                "customer=" + customer +
                ", currentPage='" + currentPage + '\'' +
                ", pageSize='" + pageSize + '\'' +
                '}';
    }
}