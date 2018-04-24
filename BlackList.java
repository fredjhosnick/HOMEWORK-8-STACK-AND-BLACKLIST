package StackBlacklist;

import java.util.ArrayList;
import java.util.List;

public class BlackList {
	private List<Class> blackList = new ArrayList<>();

	public BlackList() {
		super();
	}

	public void addClassToBlackList(Class aClass) {
		blackList.add(aClass);
	}

	public boolean checkObjectInBlackList(Object object) {
		return blackList.contains(object.getClass());
	}

}
