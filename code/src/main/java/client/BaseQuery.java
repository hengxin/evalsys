package client;

import java.util.ArrayList;

public class BaseQuery {
//    Array<uint64_t> partitions;
//    Array<uint64_t> partitions_touched;
//    Array<uint64_t> active_nodes;
//    Array<uint64_t> participant_nodes;
    private ArrayList<Long> partitions;
    private ArrayList<Long> partitionsTouched;

    public ArrayList<Long> getPartitions() {
        return partitions;
    }

    public void setPartitions(ArrayList<Long> partitions) {
        this.partitions = partitions;
    }

    public ArrayList<Long> getPartitionsTouched() {
        return partitionsTouched;
    }

    public void setPartitionsTouched(ArrayList<Long> partitionsTouched) {
        this.partitionsTouched = partitionsTouched;
    }
}
