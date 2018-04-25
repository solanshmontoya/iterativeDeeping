
public class IterDeeping {
	class Node {
        int num;
        Node next;
    }
	public void IterativeDeepening (Node n, Node goal){
		int depthLimit = 0;
		boolean result;
		do{
			result = DepthFirstSearchB(n, goal,0, depthLimit);
			depthLimit = depthLimit + 1;
		}
		while(result = false);
	}
	public boolean DepthFirstSearchB(Node n, Node goal, int depth, int limit){
		if(GoalReached(n, goal)) return true;
		newNodes = Successors(n);
		
		
		
	}
	private boolean GoalReached(Node n, Node goal) {
		// TODO Auto-generated method stub
		return false;
	}
}
