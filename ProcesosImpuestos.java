public class ProcesosImpuestos{
	
		private String nFacturaP="";
		private String fechaP="";
		private double montoCobradoP=0;
		
		private String facturaMensual="";
		private String fechaM="";
		private double montoPagado=0;

		public ProcesosImpuestos(String nFacturaP, String fechaP ,double montoCobradoP){
		
		this.nFacturaP=nFacturaP;
		this.fechaP=fechaP;
		this.montoCobradoP=montoCobradoP;
		}
		
		public ProcesosImpuestos(String facturaMensual, double montoPagado, String fechaM){
		this.facturaMensual=facturaMensual;
		this.fechaM=fechaM;
		this.montoPagado=montoPagado;
		
		}
		
	 public String mostrarFacturaProfesional(String nFacturaP,String fechaP,double montoCobradoP){
		 return "Informacion de los ingresos por servicios profesionales"
		 +"\nNumero de factura: "+nFacturaP+
		 "\nFecha: "+fechaP+
		 "\nMonto cobrado: "+montoCobradoP;
		 }
		 
		
		
	public String mostrarFacturaMensual(String facturaMensual, String fechaM, double montoPagado){
		return "Informacion de los ingresos por gastos incurridos mensualmente"
		 +"\nNumero de factura: "+facturaMensual+
		 "\nFecha: "+fechaM+
		 "\nMonto Pagado: "+montoPagado;
		
		}
		
		public double tramoRenta(double montoCobrado, double montoPagado, double subTotal){
			subTotal=montoCobrado-montoPagado;
			
			 if (subTotal>= 4127000 && subTotal <6164000) {
				return subTotal+(subTotal* 0.10); 
        
			} else if (subTotal>= 6164000 && subTotal <10281000) {
				return subTotal+(subTotal* 0.15); 
        
			} else if (subTotal >= 10281000 && subTotal <20605000) {
				return subTotal+(subTotal* 0.20); 
        
			} else if (subTotal>= 20605000) {
				return subTotal+(subTotal*0.25); 
				} else{
				
				return subTotal;
					}
				}
				
			public double creditoAplicado(double montoCobradoP,int hijos,int conyuge,double creditoHijos, double creditoConyuge){
				  
			if (hijos >= 1) {
			creditoHijos = 20760 * hijos;
				}

			if (conyuge == 1) {
			creditoConyuge = 31440;
				}
				
			return creditoHijos + creditoConyuge;
						}
			
}
