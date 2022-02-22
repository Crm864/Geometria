import java.util.Arrays;

public class geometriaJUnit {
	
	private int num1;
	private int res1:
	private int res2:	
		
	public geometriaTest(int n1, int r, r2) {
		num1 =n1;
		res=r;
		res2=r2;
	}	
 
	@Parameters
	public static Collection<Object[]> numeros(){
		
		return Arrays.asList(new Object [][] {
			{7,153.86,43.96 },{0,0,0}.{-3,28.26,18.84}
		});
	}
	
	@test
 public void testArea() {
	Circulo_CRM circulo = new Circulo_CRM(7);
	double resultado =circulo.area();
    assertEquals(res,resultado);
 }
 
	@test
 public void testPerimetro() {
		Circulo_CRM circulo = new Circulo_CRM(7);
		double resultado=circulo.perimetro();
		assertEquals(res2,resultado);
 }
 
}
