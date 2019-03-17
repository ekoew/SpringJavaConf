package co.ekoew;

public class Operator {
	//Attributes
		int opid;
		String opcodename;
		String opname;
		String opctu;
		Stats stats;
		
		//Methods
		public Operator() {
			System.out.println("---Object Constructed---");
		}
		
		//Constructor Injection
		public Operator(Stats stats) {
			this.stats = stats;
		}

		public void getOpid() {
			System.out.println("Opid : " + opid);
		}

		public void setOpid(int opid) {
			this.opid = opid;
		}

		public void getOpcodename() {
			System.out.println("Opcodename : " + opcodename);
		}

		public void setOpcodename(String opcodename) {
			this.opcodename = opcodename;
		}

		public void getOpname() {
			System.out.println("Opname : " + opname);
		}

		public void setOpname(String opname) {
			this.opname = opname;
		}

		public void getOpctu() {
			System.out.println("Opctu : " + opctu);
		}

		public void setOpctu(String opctu) {
			this.opctu = opctu;
		}

		public void getStats() {
			stats.getOpspeed();
			stats.getOparmor();
		}

		//Setter Injection
		public void setStats(Stats stats) {
			this.stats = stats;
		}
}
