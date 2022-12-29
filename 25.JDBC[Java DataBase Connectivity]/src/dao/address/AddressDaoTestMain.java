package dao.address;

import java.util.List;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception{
		/*
		 * AddressDao4 ����
		 * AddressDao4Main ���� ����Ÿ ����(����)
		 */
		AddressDao addressDao=new AddressDao();
		System.out.println("1.insert");
		Address newAddress=
				new Address(0, "ȫ����", "111-3333", "�뱸�ù�");
		int rowCount=addressDao.insert(newAddress);
		System.out.println(">> insert row count:"+ rowCount);
		System.out.println("2.update");
		Address updateAddress=
				new Address(10, "�躯��", "000-0000", "�ּҺ���");
		rowCount=addressDao.update(updateAddress);
		System.out.println(">> update row count:"+ rowCount);
		System.out.println("3.delete");
		rowCount=addressDao.delete(16);
		System.out.println(">> delete row count:"+ rowCount);
		System.out.println("3.findByPrimaryKey");
		Address findAddress=addressDao.findByPrimaryKey(10);
		if(findAddress!=null) {
			System.out.println(">> "+findAddress);
		}else {
			System.out.println(">> ���ǿ� �����ϴ� �ּҷ� �������");
		}
		System.out.println(">>"+addressDao.findByPrimaryKey(1));
		System.out.println(">>"+addressDao.findByPrimaryKey(2));
		System.out.println(">>"+addressDao.findByPrimaryKey(3));
		
		System.out.println("4.findAll");
		List<Address> addressList=
				addressDao.findAll();
		System.out.println(addressList);
		
	}

}