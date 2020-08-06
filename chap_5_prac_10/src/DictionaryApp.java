abstract class PairMap{
	protected String [] keyArray;
	protected String [] valueArray;
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}
class Dictionary extends PairMap{
	
	public Dictionary (int x) {
		keyArray = new String[x];
		valueArray = new String[x];
	}
	
	public String get(String key) {
		String keyValue = null;
		for(int i = 0; i < length(); i++) {
			if(keyArray[i].equals(key)) {
				keyValue = valueArray[i];
				break;
			}
		}
		return keyValue;
	}
	public void put(String key, String value) {
		int k = 0;
		for (int i = 0; i < length(); i++) {
			if (keyArray[i].equals(key)) {
				valueArray[i] = value;
				break;
			}
			k++;
		}
		if(k < keyArray.length) {
			keyArray[k] = key;
			valueArray[k] = value;
		}
	}
	public String delete(String key) {
		int k = 0;
		for(int i = 0; i < length(); i++) {
			if(keyArray[i].equals(key)) {
				keyArray[i] = null;
				valueArray[i] = null;
				k = i;
				break;
			}
		}
		return valueArray[k];
	}
	public int length() {
		int k = 0;
		int i = 0;
		while(true) {
			if(keyArray[i] != null) {
				k++;
				i++;
			}
			if(keyArray[i] == null)
				break;
		}
		return k;
	}
}
public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++");
				
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
				
		dic.delete("Ȳ����");
				
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}
}
