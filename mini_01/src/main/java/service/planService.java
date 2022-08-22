package service;

import java.util.List;
import java.util.Map;

import com.example.demo.plan;

public interface planService {
	
	public Map<Integer,String> allplancategory();
	public List<plan> showallplan();
	public boolean createplan(plan plan);
	public plan getplanbyId(Integer pid);
	public boolean updateplan(plan plan);
    public boolean deleteplan(Integer pid);
    public boolean changestatus(Integer pid ,String Active_switch);
}
