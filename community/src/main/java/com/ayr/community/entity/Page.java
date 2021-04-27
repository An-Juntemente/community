package com.ayr.community.entity;

public class Page {

    //当前页码
    private int pageNo = 1;

    //每页的记录数
    private int offset = 10;

    //页码总数
    private int pageCount;

    //总记录条数
    private int recordCount;

    //路径
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        if (pageNo > 0)
            this.pageNo = pageNo;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset() {
        if (offset > 0 && offset <= 40 )
            this.offset = 10;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount() {
        this.pageCount = recordCount % offset == 0 ? recordCount/offset : recordCount/offset+1;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
        this.setPageCount();
    }

    /**
     * 起始行
     * @return
     */
    public int getStartRow(){
        return (getPageNo()-1)*getOffset();
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNo=" + pageNo +
                ", offset=" + offset +
                ", pageCount=" + pageCount +
                ", recordCount=" + recordCount +
                '}';
    }
}
