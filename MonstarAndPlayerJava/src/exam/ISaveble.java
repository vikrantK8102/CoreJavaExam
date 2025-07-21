package exam;

import java.util.List;

public interface ISaveble {

	void read(List<String> data);
	
	List<String> write();
}
