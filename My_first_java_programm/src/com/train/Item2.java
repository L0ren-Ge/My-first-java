package com.train;
//��ϰ������
public abstract class Item2 {
    String name;
    int price;
    public abstract void ItemName();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Item2 xueping= new Item2() {
		@Override
		public void ItemName() {
			// TODO Auto-generated method stub
			System.out.println("��ǰ���ߵ�������"+this.name);
		}
      };
      xueping.name="Ѫƿ";
      xueping.ItemName();
      System.out.println(xueping);
	}

}
