package ch.heigvd.amt.mvcsimple.model;

public class Page {
    private int currentPage;
    private int recordsPerPage;

    public Page(int currentPage, int recordsPerPage){
        this.recordsPerPage = recordsPerPage;
        this.currentPage = currentPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getRecordsPerPage() {
        return recordsPerPage;
    }

    public void setRecordsPerPage(int recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
    }
}
