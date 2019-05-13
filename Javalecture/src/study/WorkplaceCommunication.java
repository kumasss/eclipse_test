package study;

	public class WorkplaceCommunication implements Communication{
		boolean isWorkplace = false;
		
		public WorkplaceCommunication(boolean isWorkplace){
			this.isWorkplace = isWorkplace;
		}
		
		@Override
		public String greet(String greeting) {
			if (!isWorkplace()) {
				return "";
			}
			if("Hello".equals(greeting)) {
				return "Hello";
			}
			return "";
		}
		
		public String greet(String greeting, boolean sex)throws Exception {
			if (!isWorkplace()) {
				return "";
			}
			if (!sex) {
				throw new Exception();
			}
			
			if("Hello".equals(greeting)) {
				return "Hello";
			}
			return "";
		}
		
		
		private boolean isWorkplace() {
			return isWorkplace;
		}
	}

