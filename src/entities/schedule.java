package entities;

import java.util.ArrayList;
import java.util.List;

public class schedule {
     
    private List<commitment> Commitments = new ArrayList<>();

    public void addCommitment(commitment commit){
        Commitments.add(commit);
    }

    public List<commitment> getCommitments() {
        return Commitments;
    }

    public String toString() {
        String content = "";
				
		content += "========\n";
		for (commitment Commitments: Commitments) {
			content += Commitments.toString() + "\n";
		}
		content += "========\n";
		
		return content;
	}
}
