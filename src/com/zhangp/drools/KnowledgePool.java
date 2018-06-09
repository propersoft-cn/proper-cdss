package com.zhangp.drools;

import org.drools.builder.ResourceType;

public class KnowledgePool {

	public static Object[][] DRLS1 =
		{ 
			{	"rules/dt01.xls",	ResourceType.DTABLE	}, 
			{	"rules/dt02.xls",	ResourceType.DTABLE	},
			{	"rules/dt03.xls",	ResourceType.DTABLE	},
			{	"rules/dt04.xls",	ResourceType.DTABLE	},
			{	"rules/dt07.xls",	ResourceType.DTABLE	},
			{	"rules/dt09.xls",	ResourceType.DTABLE	},
			{	"rules/dt10.xls",	ResourceType.DTABLE	},
			{	"rules/dt13.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS2 =
		{ 
			{	"rules/dt05.xls",	ResourceType.DTABLE	}
		};
	
	public static  Object[][] DRLS3 =
		{ 
			{	"rules/dt06.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS4 =
		{ 
			{	"rules/dt08.xls",	ResourceType.DTABLE	}
		};
	public static Object[][] DRLS5 =
	{ 
		{	"rules/dt11.xls",	ResourceType.DTABLE	}
	};
	public static Object[][] DRLS6 =
	{ 
		{	"rules/dt12.xls",	ResourceType.DTABLE	}
	};
	
	public static Object[][] DRLS_MRO_FLOW =
		{ 
			{	"rules/dr01.drl",	ResourceType.DRL	},
			{	"rules/rf01.rf",	ResourceType.DRF	},
			{	"rules/rf02.rf",	ResourceType.DRF	},
			{	"rules/rf03.rf",	ResourceType.DRF	},
			{	"rules/rf05.rf",	ResourceType.DRF	},
			{	"rules/rf06.rf",	ResourceType.DRF	},
			{	"rules/rf07.rf",	ResourceType.DRF	},
			{	"rules/rf08.rf",	ResourceType.DRF	}
		};
	
	public static Object[][] DRLS_MRO_RULE9 =
		{ 
			{	"rules/dtm01.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS_MRO_RULE1 =
		{ 
			{	"rules/dtm02.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS_MRO_RULE2 =
		{ 
			{	"rules/dtm03.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS_MRO_RULE3 =
		{ 
			{	"rules/dtm04.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS_MRO_RULE4 =
		{ 
			{	"rules/dtm05.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS_MRO_RULE5 =
		{ 
			{	"rules/dtm07.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS_MRO_RULE61 =
		{ 
			{	"rules/dtm08.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS_MRO_RULE62 =
		{ 
			{	"rules/dtm09.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS_MRO_RULE71 =
		{ 
			{	"rules/dtm10.xls",	ResourceType.DTABLE	}
		};
	
	public static Object[][] DRLS_MRO_RULE72 =
		{ 
			{	"rules/dtm11.xls",	ResourceType.DTABLE	}
		};
	//用于护士单次执行界面
	public static Object[][] DRLS_INW_RULE =
		{ 
			{	"rules/dt14.xls",	ResourceType.DTABLE	}			
		};
	//用于单病种转入界面
	public static Object[][] DRLS_SINGLETRANFER_RULE =
		{ 
			{	"rules/dt15.xls",	ResourceType.DTABLE	}			
		};
}
