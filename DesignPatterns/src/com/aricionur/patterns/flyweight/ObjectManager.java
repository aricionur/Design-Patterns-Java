package com.aricionur.patterns.flyweight;

import java.util.ArrayList;

public class ObjectManager {

	private static final ObjectManager objectManager = new ObjectManager();

	ArrayList<Object> objectList = new ArrayList<>();

	Object[] document = new Object[20];

	private ObjectManager() {

	}

	public static ObjectManager getInstance() {
		return objectManager;
	}

	public static Object getObject(int code) {

		Object object = null;

		for (Object eachObject : objectManager.objectList) {
			Object temp = eachObject;

			if (temp.getCode() == code) {
				object = temp;
				break;
			}
		}

		if (object == null) {
			object = new Object(code);
			objectManager.objectList.add(object);
		}

		return object;

	}

	public void addCodes(int[] codeArray) {

		for (int i = 0; i < codeArray.length; i++) {
			int code = codeArray[i];
			document[i] = getObject(code);
		}

	}

	public static void getDocument() {
		System.out.println("\n ... writing document....\n");
		for (int i = 0; i < objectManager.document.length; i++) {
			if (objectManager.document[i] != null) {
				System.out.print(objectManager.document[i].getCode() + " ");
			}else {
				break;
			}
		}
		
		System.out.println("Created object number  :  " + objectManager.objectList.size());
	}

}
