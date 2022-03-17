package workload;

import client.BaseQuery;
import java.util.List;

/**
 * Each YCSBQuery contains several YCSBRequest
 */
public class YCSBQuery extends BaseQuery {
    private List<YCSBRequest> requests;

    public List<YCSBRequest> getRequests() {
        return requests;
    }

    public void setRequests(List<YCSBRequest> requests) {
        this.requests = requests;
    }
}
