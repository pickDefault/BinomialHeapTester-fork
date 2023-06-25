package binomialheaptester.steps;
import binomialheaptester.State;


public class InsertStep implements Step {
    public int heapIndex;
    public int key;
    public String info;

    public InsertStep(int heapIndex, int key, String info) {
        this.heapIndex = heapIndex;
        this.key = key;
        this.info = info;
    }

    @Override
    public String perform(State state) {
        State.SingleHeapState heapState = state.heapStates.get(this.heapIndex);
        heapState.heap.insert(this.key, this.info);
        heapState.items.put(info, this.key);
        return null;
    }

    public String toString(){
        return "Insert " + this.heapIndex + " " + this.key + " " + this.info;
    }


}
