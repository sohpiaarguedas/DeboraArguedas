import javax.swing.JOptionPane;


public class SistemaImpuestos{
	public static void main(String arg[]){
		SistemaImpuestos sistema = new SistemaImpuestos();
		sistema.menu();
		}
	public void menu(){
		
		
		
		ProcesosImpuestos facturaIngresos = null;
        ProcesosImpuestos facturaGastos = null;
		
		 
		int option;
		String nFacturaP="";
		String fechaP="";
		double montoCobradoP=0;
		
		String facturaMensual="";
		String fechaM="";
		double montoPagado=0;
		
		int hijos=0;
		int conyuge=0;
		double creditoHijos=0;
		double creditoConyuge=0;
		
		double subTotal=0;
		
		do{
		option=Integer.parseInt(JOptionPane.showInputDialog("**********Bienvenido al menu**********"
		+"\n1. Ingresar las facturas por servicios profesionales"
		+"\n2. Ingresar gastos"
		+"\n3. Listado de ingresos"
		+"\n4. Listado de gastos"
		+"\n5. Calculo del impuesto de renta"
		+"\n6. Salir"));
		
		
		switch(option){
		
		case 1:
		nFacturaP=JOptionPane.showInputDialog("Digite el numero de factura");
		
		fechaP=JOptionPane.showInputDialog("Digite la fecha del ingreso");
		
		montoCobradoP=Double.parseDouble(JOptionPane.showInputDialog("Digite el monto depositado"));
		
		facturaIngresos= new ProcesosImpuestos( nFacturaP, fechaP, montoCobradoP);
		
		
		break;
		
		case 2:
		facturaMensual=JOptionPane.showInputDialog("Digite el numero de factura");
		fechaM=JOptionPane.showInputDialog("Digite la fecha del ingreso");
		montoPagado=Double.parseDouble(JOptionPane.showInputDialog("Digite el monto pagado"));
		
		facturaGastos= new ProcesosImpuestos(facturaMensual, fechaM, montoPagado);
		
		
		break;
		
		case 3:
		if (facturaIngresos != null) {
				JOptionPane.showMessageDialog(null,facturaIngresos.mostrarFacturaProfesional( nFacturaP, fechaP, montoCobradoP));
			} else{
				JOptionPane.showMessageDialog(null,"Aun no hay ingresos en la factura");}
				
		break;
		
		case 4: 
		if (facturaGastos != null) {
				JOptionPane.showMessageDialog(null,facturaGastos.mostrarFacturaMensual(facturaMensual, fechaM,montoPagado));
			}else {
				JOptionPane.showMessageDialog(null,"Aun no hay gastos en la factura");
				}
		break;
		
		case 5:
			 if (facturaIngresos != null && facturaGastos != null) {
			subTotal=montoCobradoP-montoPagado;
			
			hijos=(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de hijos que tiene")));
			conyuge=(Integer.parseInt(JOptionPane.showInputDialog("Digite 1 si tiene conguye, digite otro numero si no tiene conguye.")));
		
			double conceptoCredito = facturaGastos.creditoAplicado(montoCobradoP, hijos, conyuge, creditoHijos,creditoConyuge);
			double total=subTotal-conceptoCredito;
			
			JOptionPane.showMessageDialog(null,"Factura ingresos: "+facturaIngresos.mostrarFacturaProfesional( nFacturaP, fechaP, montoCobradoP)
			+"\nFactura gastos: "+facturaGastos.mostrarFacturaMensual(facturaMensual, fechaM,montoPagado)
			+"\nUtilidades: "+facturaGastos.tramoRenta(montoCobradoP, montoPagado, subTotal)
			+"\nConcepto aplicado por hijos y conyuge: "+facturaGastos.creditoAplicado(montoCobradoP, hijos, conyuge, creditoHijos,creditoConyuge)
			+"\nMonto a pagar por impuestos de renta: "+total);
			}else {
                   JOptionPane.showMessageDialog(null, "Debe registrar los ingresos y gastos para de calcular el impuesto.");
                   }
		break;
		
		case 6:
				JOptionPane.showMessageDialog(null,"Saliendo...");
		break;
		
		default:
				JOptionPane.showMessageDialog(null,"Opcion invalida, porfavor digite una opcion valida");
		break;
		}
		
		}while(option!=6);
		}
	}

	
