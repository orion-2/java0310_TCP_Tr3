package ExtendsEX;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//subŬ������ �ڿ��� ����Ŭ������ �ڿ��� ��� ��밡��
		ArrayList<Zoo> pList = new ArrayList<>();
		Zoo p1 = new Poyu("����"); 
		pList.add(p1);
		
		Zoo p2 = new Poyu("ȣ����");  
		pList.add(p2);
		
		Zoo b1 = new Birds("����");
		pList.add(b1);
		
		Zoo b2 = new Birds("����");
		pList.add(b2);
		
		for(int i = 0; i < pList.size(); i++) {
			pList.get(i).eatting();
			if (pList.get(i) instanceof Poyu ) {
				Poyu p = (Poyu)pList.get(i); //��ü ����ȯ
				p.baby();
			}	
		}
		
						
		//����Ŭ������ ��ü�� subŬ������ ��� ����� �Ұ��� 
//		Zoo z1 = new Poyu();
//		z1.eatting();
		//z1.baby();
	}

}
