package it.janczewski;

/**
 * Created by tj on 27.01.16.
 */
public enum Status {
    ACTIVE(200,"Active","Node is active and free for operations"),
    BUSY(300,"Busy","Node is active but is busy"),
    INACTIVE(400,"Inactive","Node is inactive");

    private Status(int status_code, String status_name, String description) {
        this.status_code = status_code;
        this.status_name = status_name;
        this.description = description;
    }

    public int getStatus_code() {
        return status_code;
    }

    public String getStatus_name() {
        return status_name;
    }

    public String getDescription() {
        return description;
    }

    private int status_code;
    private String status_name;
    private String description;

}
