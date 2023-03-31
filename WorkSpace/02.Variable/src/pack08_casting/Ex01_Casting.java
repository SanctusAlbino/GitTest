package pack08_casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10; //������ ���� a�� �ʱ�ȭ �ϰ� 10�� ��Ƶ�
		double dNum = iNum; // �� ūŸ�Կ� ���� Ÿ���� ������ �ڵ�
							// ��ȯ�� �Ͼ (�ڵ� ����ȯ)
		System.out.println(iNum);
		System.out.println(dNum);
		//�ڵ�����ȯ�� �߻��� ���� Ÿ��(int) => ū Ÿ��(double)
		//������ ����ȯ, Upcasting
		double dNum2 = 30.5;
		//int iNum2 = dNum2; //���������� Ÿ�Կ� ū Ÿ���� ������ �����߻�
		//������ ����ȯ, DownCasting ==> Casting�� �Ϲ����� �ǹ�
		int iNum2 = (int) dNum2;
		System.out.println(dNum2);
		System.out.println(iNum2);
		//DownCasting�� ������ �߻���. ǥ���� �� ���� �����͸� ��������.
		//�������� �ŷڼ� , ���ռ��� ������ ���ɼ��� ũ�⶧���� ����

		// long => int, int => float
		// ���� ���ڸ� ǥ���ϴ� ������ Ÿ�Գ����� ������.
		// byte < int
		// int ������ �ʱ�ȭ�ؼ� �ϳ� ����� �� ���.
		// byte�� ������ ��ƺ���
		//1. � Casting�ϱ�?
		//2. ���� �ڵ� �ۼ�
		int iNum3 = 257;
		byte dNum3 = (byte) iNum3;
		System.out.println(dNum3);
		
	}
}