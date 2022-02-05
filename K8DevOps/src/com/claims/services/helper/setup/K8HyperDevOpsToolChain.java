package com.claims.services.helper.setup;

public class K8HyperDevOpsToolChain {
	
	public  String chainOne() {
		return ("Chain 1: Source Control is GitHub");
	}
	
	public static void main(String args[]) {
		
		
	System.out.println("---------------------------");
	System.out.println("-------- > Hello Kube : Deployment succeded");
	System.out.println("---------> with end to end CI-CD DevOps hyper automated tool chain ");
	System.out.println("-------------------------- -");
	K8HyperDevOpsToolChain app = new K8HyperDevOpsToolChain();
	System.out.println(""+app.chainOne());
	

	}
}
