import java.net.CacheRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum StatusEnum {

    OPEN,
    IN_PROGRESS,
    PAUSED,
    FINISHED,
    CANCELED;

    public List<StatusEnum> nextStatus(){
        if (this == OPEN){
            return Arrays.asList(IN_PROGRESS, CANCELED);
        } else if (this == IN_PROGRESS) {
            return Arrays.asList(PAUSED, FINISHED);
        } else if (this == PAUSED) {
            return Arrays.asList(IN_PROGRESS, FINISHED);
        } else {
            return Collections.emptyList();
        }
    }
}