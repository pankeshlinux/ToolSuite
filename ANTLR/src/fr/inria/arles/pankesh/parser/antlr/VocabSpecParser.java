// $ANTLR 3.4 /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g 2013-04-09 14:18:49

package fr.inria.arles.pankesh.parser.antlr;
import fr.inria.arles.pankesh.dslcompiler.*; 
import fr.inria.arles.pankesh.semanticmodel.*;  
   


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class VocabSpecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAPITALIZED_ID", "ID", "INT", "WS", "'('", "')'", "','", "':'", "';'", "'Boolean'", "'Integer'", "'String'", "'accessed-by'", "'action'", "'actuators'", "'attribute'", "'boolean'", "'command'", "'computationalService'", "'consume'", "'controller'", "'deployment-instance'", "'double'", "'end user applications'", "'from'", "'generate'", "'long'", "'partition-per'", "'region-hops'", "'regions'", "'request'", "'resources'", "'sensors'", "'singleton'", "'storageService'", "'storages'", "'structs'", "'to'", "'with'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int CAPITALIZED_ID=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public VocabSpecParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public VocabSpecParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return VocabSpecParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g"; }


      //Initialize the context
      private Context context; 



    // $ANTLR start "vocabSpec"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:24:1: vocabSpec : 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def ;
    public final void vocabSpec() throws RecognitionException {
        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:24:11: ( 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:25:3: 'regions' ':' ( region_def )+ 'structs' ':' ( struct_def )+ 'resources' ':' abilities_def
            {
            match(input,33,FOLLOW_33_in_vocabSpec63); 

             context = new Context();
            		context.currentRegion = new RegionsGenerator();
            		context.currentMappingConstraint = new MappingConstraint(); 

            match(input,11,FOLLOW_11_in_vocabSpec71); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:29:7: ( region_def )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CAPITALIZED_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:29:8: region_def
            	    {
            	    pushFollow(FOLLOW_region_def_in_vocabSpec74);
            	    region_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


             context.currentRegion.generateCode(); 

            match(input,40,FOLLOW_40_in_vocabSpec91); 

            match(input,11,FOLLOW_11_in_vocabSpec110); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:33:5: ( struct_def )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CAPITALIZED_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:33:6: struct_def
            	    {
            	    pushFollow(FOLLOW_struct_def_in_vocabSpec124);
            	    struct_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input,35,FOLLOW_35_in_vocabSpec134); 

            match(input,11,FOLLOW_11_in_vocabSpec136); 

            pushFollow(FOLLOW_abilities_def_in_vocabSpec138);
            abilities_def();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "vocabSpec"



    // $ANTLR start "region_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:38:1: region_def : CAPITALIZED_ID ':' dataType ';' ;
    public final void region_def() throws RecognitionException {
        Token CAPITALIZED_ID1=null;
        VocabSpecParser.dataType_return dataType2 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:38:12: ( CAPITALIZED_ID ':' dataType ';' )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:40:6: CAPITALIZED_ID ':' dataType ';'
            {
            CAPITALIZED_ID1=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_region_def165); 

            match(input,11,FOLLOW_11_in_region_def167); 

            pushFollow(FOLLOW_dataType_in_region_def169);
            dataType2=dataType();

            state._fsp--;


            match(input,12,FOLLOW_12_in_region_def172); 

             
                context.currentRegion.addRegion((CAPITALIZED_ID1!=null?CAPITALIZED_ID1.getText():null), (dataType2!=null?input.toString(dataType2.start,dataType2.stop):null)); 
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "region_def"



    // $ANTLR start "sc_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:46:1: sc_def : ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ( 'controller' ( controller_def )+ )* ;
    public final void sc_def() throws RecognitionException {
        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:46:8: ( ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ( 'controller' ( controller_def )+ )* )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:47:2: ( 'storageService' ( ss_def )+ )* 'computationalService' ( cs_def )+ ( 'controller' ( controller_def )+ )*
            {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:47:2: ( 'storageService' ( ss_def )+ )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==38) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:47:3: 'storageService' ( ss_def )+
            	    {
            	    match(input,38,FOLLOW_38_in_sc_def189); 

            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:47:20: ( ss_def )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==CAPITALIZED_ID) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:47:21: ss_def
            	    	    {
            	    	    pushFollow(FOLLOW_ss_def_in_sc_def192);
            	    	    ss_def();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,22,FOLLOW_22_in_sc_def203); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:48:27: ( cs_def )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CAPITALIZED_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:48:28: cs_def
            	    {
            	    pushFollow(FOLLOW_cs_def_in_sc_def206);
            	    cs_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:49:5: ( 'controller' ( controller_def )+ )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:49:6: 'controller' ( controller_def )+
            	    {
            	    match(input,24,FOLLOW_24_in_sc_def216); 

            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:49:19: ( controller_def )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==CAPITALIZED_ID) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:49:20: controller_def
            	    	    {
            	    	    pushFollow(FOLLOW_controller_def_in_sc_def219);
            	    	    controller_def();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sc_def"



    // $ANTLR start "ss_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:53:1: ss_def : CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* ;
    public final void ss_def() throws RecognitionException {
        Token CAPITALIZED_ID3=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:53:7: ( CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )* )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:54:3: CAPITALIZED_ID ( storageAttribute_def ';' )* ( storageDataAccess_def ';' )*
            {
            CAPITALIZED_ID3=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_ss_def240); 

            	context.currentStorageService = new Storage();
                	//context.currentStorageService = new Storage((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                	

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:58:5: ( storageAttribute_def ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:58:6: storageAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_storageAttribute_def_in_ss_def253);
            	    storageAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def255); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:59:5: ( storageDataAccess_def ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:59:6: storageDataAccess_def ';'
            	    {
            	    pushFollow(FOLLOW_storageDataAccess_def_in_ss_def264);
            	    storageDataAccess_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_ss_def266); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



                 	
                 context.currentStorageService.setStorageServiceName((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                 context.currentStorageService.createStorageObject();
                 context.currentStorageService.generateCode();
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID3!=null?CAPITALIZED_ID3.getText():null));
                 context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
                 
                 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "ss_def"



    // $ANTLR start "storageAttribute_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:72:1: storageAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void storageAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id4 =null;

        VocabSpecParser.dataType_return dataType5 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:72:21: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:73:3: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_storageAttribute_def290); 

            pushFollow(FOLLOW_lc_id_in_storageAttribute_def292);
            lc_id4=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageAttribute_def294); 

            pushFollow(FOLLOW_dataType_in_storageAttribute_def296);
            dataType5=dataType();

            state._fsp--;


             context.currentStorageService.addAttribute((lc_id4!=null?input.toString(lc_id4.start,lc_id4.stop):null), (dataType5!=null?input.toString(dataType5.start,dataType5.stop):null));  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "storageAttribute_def"



    // $ANTLR start "storageDataAccess_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:77:1: storageDataAccess_def : storageGeneratedInfo_def 'accessed-by' storagedataIndex_def ;
    public final void storageDataAccess_def() throws RecognitionException {
        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:77:23: ( storageGeneratedInfo_def 'accessed-by' storagedataIndex_def )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:78:6: storageGeneratedInfo_def 'accessed-by' storagedataIndex_def
            {
            pushFollow(FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def317);
            storageGeneratedInfo_def();

            state._fsp--;


            match(input,16,FOLLOW_16_in_storageDataAccess_def320); 

            pushFollow(FOLLOW_storagedataIndex_def_in_storageDataAccess_def322);
            storagedataIndex_def();

            state._fsp--;


             context.currentStorageService.addDataAccess(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "storageDataAccess_def"



    // $ANTLR start "storageGeneratedInfo_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:82:1: storageGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void storageGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID7=null;
        VocabSpecParser.lc_id_return lc_id6 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:82:26: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:83:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,29,FOLLOW_29_in_storageGeneratedInfo_def341); 

            pushFollow(FOLLOW_lc_id_in_storageGeneratedInfo_def343);
            lc_id6=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storageGeneratedInfo_def345); 

            CAPITALIZED_ID7=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def348); 

             context.currentStorageService.addGeneratedInfo((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));  
                context.constructSymbTable((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));
                context.constructResponseTypeSymblTable((lc_id6!=null?input.toString(lc_id6.start,lc_id6.stop):null), (CAPITALIZED_ID7!=null?CAPITALIZED_ID7.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "storageGeneratedInfo_def"



    // $ANTLR start "storagedataIndex_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:89:1: storagedataIndex_def : lc_id ':' dataType ;
    public final void storagedataIndex_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id8 =null;

        VocabSpecParser.dataType_return dataType9 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:89:21: ( lc_id ':' dataType )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:90:9: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_storagedataIndex_def370);
            lc_id8=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_storagedataIndex_def372); 

            pushFollow(FOLLOW_dataType_in_storagedataIndex_def374);
            dataType9=dataType();

            state._fsp--;


             context.currentStorageService.addDataAccessIndex((lc_id8!=null?input.toString(lc_id8.start,lc_id8.stop):null), (dataType9!=null?input.toString(dataType9.start,dataType9.stop):null));  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "storagedataIndex_def"



    // $ANTLR start "storagePartition_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:94:1: storagePartition_def : storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' ;
    public final void storagePartition_def() throws RecognitionException {
        Token storageDeploymentConstraint=null;
        Token storageDeploymentConstraintValue=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:94:22: (storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton' )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:95:5: storageDeploymentConstraint= 'deployment-instance' ':' storageDeploymentConstraintValue= 'singleton'
            {
            storageDeploymentConstraint=(Token)match(input,25,FOLLOW_25_in_storagePartition_def403); 

            match(input,11,FOLLOW_11_in_storagePartition_def405); 

            storageDeploymentConstraintValue=(Token)match(input,37,FOLLOW_37_in_storagePartition_def411); 


                 
                 // Next two lines are for  Mapping constraints
                context.currentMappingConstraint.setAttributeName((storageDeploymentConstraint!=null?storageDeploymentConstraint.getText():null));  
                context.currentMappingConstraint.setAttributeValue((storageDeploymentConstraintValue!=null?storageDeploymentConstraintValue.getText():null));  
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "storagePartition_def"



    // $ANTLR start "controller_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:105:1: controller_def : CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* ;
    public final void controller_def() throws RecognitionException {
        Token CAPITALIZED_ID10=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:105:15: ( CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )* )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:106:3: CAPITALIZED_ID ( cntrlAttribute_def ';' )* ( cntrlConsumeInfo_def ';' )* ( cntrlCommand_def ';' )* ( cntrlPartition_def ';' )*
            {
            CAPITALIZED_ID10=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_controller_def428); 


                context.currentController = new ControllerService();
                //context.currentController = new ControllerService((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:111:5: ( cntrlAttribute_def ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:111:6: cntrlAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlAttribute_def_in_controller_def441);
            	    cntrlAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def443); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:112:5: ( cntrlConsumeInfo_def ';' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:112:6: cntrlConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlConsumeInfo_def_in_controller_def452);
            	    cntrlConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def454); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:113:5: ( cntrlCommand_def ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:113:6: cntrlCommand_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlCommand_def_in_controller_def463);
            	    cntrlCommand_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def465); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:114:5: ( cntrlPartition_def ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:114:6: cntrlPartition_def ';'
            	    {
            	    pushFollow(FOLLOW_cntrlPartition_def_in_controller_def475);
            	    cntrlPartition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_controller_def477); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);



                context.currentController.setControllerName((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                context.currentController.createCSObject();
                context.currentController.generateCode();
                context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID10!=null?CAPITALIZED_ID10.getText():null));
                context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
                
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "controller_def"



    // $ANTLR start "cntrlPartition_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:125:1: cntrlPartition_def : cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void cntrlPartition_def() throws RecognitionException {
        Token cntrlDeploymentConstraint=null;
        Token CAPITALIZED_ID11=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:125:20: (cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:126:2: cntrlDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            cntrlDeploymentConstraint=(Token)match(input,31,FOLLOW_31_in_cntrlPartition_def498); 

            match(input,11,FOLLOW_11_in_cntrlPartition_def500); 

            CAPITALIZED_ID11=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def502); 

             
                context.currentController.setPartitionAttribute((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null)); 
                 // Next two lines are for  Mapping constraints
                context.currentMappingConstraint.setAttributeName((cntrlDeploymentConstraint!=null?cntrlDeploymentConstraint.getText():null));  
                context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID11!=null?CAPITALIZED_ID11.getText():null));  
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cntrlPartition_def"



    // $ANTLR start "cntrlAttribute_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:135:1: cntrlAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void cntrlAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id12 =null;

        VocabSpecParser.dataType_return dataType13 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:135:19: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:136:3: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_cntrlAttribute_def520); 

            pushFollow(FOLLOW_lc_id_in_cntrlAttribute_def522);
            lc_id12=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_cntrlAttribute_def524); 

            pushFollow(FOLLOW_dataType_in_cntrlAttribute_def526);
            dataType13=dataType();

            state._fsp--;


             context.currentController.addAttribute((lc_id12!=null?input.toString(lc_id12.start,lc_id12.stop):null), (dataType13!=null?input.toString(dataType13.start,dataType13.stop):null));  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cntrlAttribute_def"



    // $ANTLR start "cntrlConsumeInfo_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:140:1: cntrlConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void cntrlConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id14 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:140:21: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:141:2: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,23,FOLLOW_23_in_cntrlConsumeInfo_def542); 

            pushFollow(FOLLOW_lc_id_in_cntrlConsumeInfo_def544);
            lc_id14=lc_id();

            state._fsp--;


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:141:18: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:141:19: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,28,FOLLOW_28_in_cntrlConsumeInfo_def547); 

                    match(input,32,FOLLOW_32_in_cntrlConsumeInfo_def549); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def551); 

                    match(input,INT,FOLLOW_INT_in_cntrlConsumeInfo_def553); 

                    match(input,11,FOLLOW_11_in_cntrlConsumeInfo_def555); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def557); 

                    }
                    break;

            }


             context.currentController.addConsumedInfo((lc_id14!=null?input.toString(lc_id14.start,lc_id14.stop):null));  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cntrlConsumeInfo_def"



    // $ANTLR start "cntrlCommand_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:145:1: cntrlCommand_def : 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID ;
    public final void cntrlCommand_def() throws RecognitionException {
        Token name=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:145:18: ( 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:146:5: 'command' name= CAPITALIZED_ID '(' ( cntrlParameter_def )? ')' 'to' 'region-hops' ':' INT ':' CAPITALIZED_ID
            {
            match(input,21,FOLLOW_21_in_cntrlCommand_def582); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def589); 

            match(input,8,FOLLOW_8_in_cntrlCommand_def591); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:146:42: ( cntrlParameter_def )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:146:43: cntrlParameter_def
                    {
                    pushFollow(FOLLOW_cntrlParameter_def_in_cntrlCommand_def594);
                    cntrlParameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_cntrlCommand_def598); 

            match(input,41,FOLLOW_41_in_cntrlCommand_def600); 

            match(input,32,FOLLOW_32_in_cntrlCommand_def603); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def605); 

            match(input,INT,FOLLOW_INT_in_cntrlCommand_def607); 

            match(input,11,FOLLOW_11_in_cntrlCommand_def609); 

            match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def611); 

             
                  context.currentController.addCommand((name!=null?name.getText():null));  
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cntrlCommand_def"



    // $ANTLR start "cntrlParameter_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:152:1: cntrlParameter_def : lc_id ( ',' parameter_def )? ;
    public final void cntrlParameter_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id15 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:152:20: ( lc_id ( ',' parameter_def )? )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:153:5: lc_id ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_cntrlParameter_def631);
            lc_id15=lc_id();

            state._fsp--;


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:153:12: ( ',' parameter_def )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==10) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:153:13: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_cntrlParameter_def635); 

                    pushFollow(FOLLOW_parameter_def_in_cntrlParameter_def637);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             context.currentController.addParameter((lc_id15!=null?input.toString(lc_id15.start,lc_id15.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cntrlParameter_def"



    // $ANTLR start "cs_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:157:1: cs_def : CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* ;
    public final void cs_def() throws RecognitionException {
        Token CAPITALIZED_ID16=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:157:7: ( CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )* )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:158:3: CAPITALIZED_ID ( csAttribute_def ';' )* ( csGeneratedInfo_def ';' )* ( csConsumeInfo_def ';' )* ( csRequest_def ';' )* ( partition_def ';' )*
            {
            CAPITALIZED_ID16=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_cs_def658); 

             
                 context.currentComputationalService = new CS(); 
                 context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:162:5: ( csAttribute_def ';' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:162:6: csAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_csAttribute_def_in_cs_def671);
            	    csAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def673); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:163:5: ( csGeneratedInfo_def ';' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:163:6: csGeneratedInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csGeneratedInfo_def_in_cs_def682);
            	    csGeneratedInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def684); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:164:5: ( csConsumeInfo_def ';' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:164:6: csConsumeInfo_def ';'
            	    {
            	    pushFollow(FOLLOW_csConsumeInfo_def_in_cs_def694);
            	    csConsumeInfo_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def696); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:165:5: ( csRequest_def ';' )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:165:6: csRequest_def ';'
            	    {
            	    pushFollow(FOLLOW_csRequest_def_in_cs_def706);
            	    csRequest_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def709); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:166:5: ( partition_def ';' )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:166:6: partition_def ';'
            	    {
            	    pushFollow(FOLLOW_partition_def_in_cs_def718);
            	    partition_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_cs_def720); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


             
                 context.currentComputationalService.setComputationalServiceName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));
                 context.currentComputationalService.createCSObject();
                context.currentComputationalService.generateCode(); 
                // Next line is for Software Component Name
                context.currentMappingConstraint.setSoftwareComponentName((CAPITALIZED_ID16!=null?CAPITALIZED_ID16.getText():null));
                context.currentMappingConstraint.addDeployementConstraintObj(); // This line creates a  Symbol Table
                
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cs_def"



    // $ANTLR start "csAttribute_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:178:1: csAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void csAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id17 =null;

        VocabSpecParser.dataType_return dataType18 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:178:17: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:179:5: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_csAttribute_def741); 

            pushFollow(FOLLOW_lc_id_in_csAttribute_def743);
            lc_id17=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csAttribute_def745); 

            pushFollow(FOLLOW_dataType_in_csAttribute_def747);
            dataType18=dataType();

            state._fsp--;


             context.currentComputationalService.addAttribute((lc_id17!=null?input.toString(lc_id17.start,lc_id17.stop):null), (dataType18!=null?input.toString(dataType18.start,dataType18.stop):null));  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "csAttribute_def"



    // $ANTLR start "csGeneratedInfo_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:183:1: csGeneratedInfo_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void csGeneratedInfo_def() throws RecognitionException {
        Token CAPITALIZED_ID20=null;
        VocabSpecParser.lc_id_return lc_id19 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:183:20: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:184:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,29,FOLLOW_29_in_csGeneratedInfo_def766); 

            pushFollow(FOLLOW_lc_id_in_csGeneratedInfo_def768);
            lc_id19=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_csGeneratedInfo_def770); 

            CAPITALIZED_ID20=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def773); 

             context.currentComputationalService.addGeneratedInfo((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null), (CAPITALIZED_ID20!=null?CAPITALIZED_ID20.getText():null)); 
                context.constructSymbTable((lc_id19!=null?input.toString(lc_id19.start,lc_id19.stop):null), (CAPITALIZED_ID20!=null?CAPITALIZED_ID20.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "csGeneratedInfo_def"



    // $ANTLR start "csConsumeInfo_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:189:1: csConsumeInfo_def : 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? ;
    public final void csConsumeInfo_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id21 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:189:18: ( 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )? )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:190:3: 'consume' lc_id ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            {
            match(input,23,FOLLOW_23_in_csConsumeInfo_def791); 

            pushFollow(FOLLOW_lc_id_in_csConsumeInfo_def793);
            lc_id21=lc_id();

            state._fsp--;


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:190:19: ( 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:190:20: 'from' 'region-hops' ':' INT ':' CAPITALIZED_ID
                    {
                    match(input,28,FOLLOW_28_in_csConsumeInfo_def796); 

                    match(input,32,FOLLOW_32_in_csConsumeInfo_def798); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def800); 

                    match(input,INT,FOLLOW_INT_in_csConsumeInfo_def802); 

                    match(input,11,FOLLOW_11_in_csConsumeInfo_def804); 

                    match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def806); 

                    }
                    break;

            }


             context.currentComputationalService.addConsumedInfo((lc_id21!=null?input.toString(lc_id21.start,lc_id21.stop):null));  
                
               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "csConsumeInfo_def"



    // $ANTLR start "csRequest_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:196:1: csRequest_def : 'request' lc_id ;
    public final void csRequest_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id22 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:196:15: ( 'request' lc_id )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:197:4: 'request' lc_id
            {
            match(input,34,FOLLOW_34_in_csRequest_def828); 

            pushFollow(FOLLOW_lc_id_in_csRequest_def830);
            lc_id22=lc_id();

            state._fsp--;


             context.currentComputationalService.getDataAccessListFromSymblTable((lc_id22!=null?input.toString(lc_id22.start,lc_id22.stop):null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "csRequest_def"



    // $ANTLR start "partition_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:201:1: partition_def : csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID ;
    public final void partition_def() throws RecognitionException {
        Token csDeploymentConstraint=null;
        Token CAPITALIZED_ID23=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:201:14: (csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:202:5: csDeploymentConstraint= 'partition-per' ':' CAPITALIZED_ID
            {
            csDeploymentConstraint=(Token)match(input,31,FOLLOW_31_in_partition_def850); 

            match(input,11,FOLLOW_11_in_partition_def852); 

            CAPITALIZED_ID23=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_partition_def854); 

             
                context.currentComputationalService.addPartitionAttribute((CAPITALIZED_ID23!=null?CAPITALIZED_ID23.getText():null));   
                // Next two lines are for  Mapping constraints
                context.currentMappingConstraint.setAttributeName((csDeploymentConstraint!=null?csDeploymentConstraint.getText():null));  
                context.currentMappingConstraint.setAttributeValue((CAPITALIZED_ID23!=null?CAPITALIZED_ID23.getText():null)); 
               

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "partition_def"



    // $ANTLR start "struct_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:211:1: struct_def : CAPITALIZED_ID ( structField_def ';' )* ;
    public final void struct_def() throws RecognitionException {
        Token CAPITALIZED_ID24=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:211:11: ( CAPITALIZED_ID ( structField_def ';' )* )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:212:5: CAPITALIZED_ID ( structField_def ';' )*
            {
            CAPITALIZED_ID24=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_struct_def873); 

            context.currentStruct = new Struct((CAPITALIZED_ID24!=null?CAPITALIZED_ID24.getText():null));

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:214:5: ( structField_def ';' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:214:6: structField_def ';'
            	    {
            	    pushFollow(FOLLOW_structField_def_in_struct_def887);
            	    structField_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_struct_def889); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            context.currentStruct.generateCode();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "struct_def"



    // $ANTLR start "structField_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:217:1: structField_def : lc_id ':' dataType ;
    public final void structField_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id25 =null;

        VocabSpecParser.dataType_return dataType26 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:217:16: ( lc_id ':' dataType )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:218:3: lc_id ':' dataType
            {
            pushFollow(FOLLOW_lc_id_in_structField_def911);
            lc_id25=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_structField_def913); 

            pushFollow(FOLLOW_dataType_in_structField_def915);
            dataType26=dataType();

            state._fsp--;


             context.currentStruct.addField((lc_id25!=null?input.toString(lc_id25.start,lc_id25.stop):null), (dataType26!=null?input.toString(dataType26.start,dataType26.stop):null));
                context.constructStructSymblTable(context.currentStruct.getStructName(),context.currentStruct);  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "structField_def"


    public static class lc_id_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "lc_id"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:223:1: lc_id : ID ;
    public final VocabSpecParser.lc_id_return lc_id() throws RecognitionException {
        VocabSpecParser.lc_id_return retval = new VocabSpecParser.lc_id_return();
        retval.start = input.LT(1);


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:223:6: ( ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:223:8: ID
            {
            match(input,ID,FOLLOW_ID_in_lc_id931); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lc_id"


    public static class dataType_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "dataType"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:226:1: dataType : primitiveType ;
    public final VocabSpecParser.dataType_return dataType() throws RecognitionException {
        VocabSpecParser.dataType_return retval = new VocabSpecParser.dataType_return();
        retval.start = input.LT(1);


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:226:9: ( primitiveType )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:227:3: primitiveType
            {
            pushFollow(FOLLOW_primitiveType_in_dataType944);
            primitiveType();

            state._fsp--;


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dataType"



    // $ANTLR start "primitiveType"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:230:1: primitiveType : (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) ;
    public final void primitiveType() throws RecognitionException {
        Token id=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:230:14: ( (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' ) )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:231:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:231:3: (id= 'Integer' |id= 'Boolean' |id= 'String' |id= 'double' |id= 'long' |id= 'boolean' )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt24=1;
                }
                break;
            case 13:
                {
                alt24=2;
                }
                break;
            case 15:
                {
                alt24=3;
                }
                break;
            case 26:
                {
                alt24=4;
                }
                break;
            case 30:
                {
                alt24=5;
                }
                break;
            case 20:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:231:4: id= 'Integer'
                    {
                    id=(Token)match(input,14,FOLLOW_14_in_primitiveType959); 

                    }
                    break;
                case 2 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:231:19: id= 'Boolean'
                    {
                    id=(Token)match(input,13,FOLLOW_13_in_primitiveType965); 

                    }
                    break;
                case 3 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:231:34: id= 'String'
                    {
                    id=(Token)match(input,15,FOLLOW_15_in_primitiveType971); 

                    }
                    break;
                case 4 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:231:49: id= 'double'
                    {
                    id=(Token)match(input,26,FOLLOW_26_in_primitiveType980); 

                    }
                    break;
                case 5 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:231:65: id= 'long'
                    {
                    id=(Token)match(input,30,FOLLOW_30_in_primitiveType988); 

                    }
                    break;
                case 6 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:231:79: id= 'boolean'
                    {
                    id=(Token)match(input,20,FOLLOW_20_in_primitiveType994); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primitiveType"



    // $ANTLR start "abilities_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:1: abilities_def : 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'end user applications' ':' ( gui_def ) )* ;
    public final void abilities_def() throws RecognitionException {
        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:234:15: ( 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'end user applications' ':' ( gui_def ) )* )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:235:3: 'sensors' ':' ( sensor_def )+ 'actuators' ':' ( actuator_def )+ 'storages' ':' ( ss_def )+ ( 'end user applications' ':' ( gui_def ) )*
            {
            match(input,36,FOLLOW_36_in_abilities_def1007); 

            match(input,11,FOLLOW_11_in_abilities_def1009); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:235:19: ( sensor_def )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==CAPITALIZED_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:235:20: sensor_def
            	    {
            	    pushFollow(FOLLOW_sensor_def_in_abilities_def1014);
            	    sensor_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            match(input,18,FOLLOW_18_in_abilities_def1020); 

            match(input,11,FOLLOW_11_in_abilities_def1022); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:236:19: ( actuator_def )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==CAPITALIZED_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:236:20: actuator_def
            	    {
            	    pushFollow(FOLLOW_actuator_def_in_abilities_def1025);
            	    actuator_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            match(input,39,FOLLOW_39_in_abilities_def1031); 

            match(input,11,FOLLOW_11_in_abilities_def1034); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:237:19: ( ss_def )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==CAPITALIZED_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:237:20: ss_def
            	    {
            	    pushFollow(FOLLOW_ss_def_in_abilities_def1037);
            	    ss_def();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:238:3: ( 'end user applications' ':' ( gui_def ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==27) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:238:4: 'end user applications' ':' ( gui_def )
            	    {
            	    match(input,27,FOLLOW_27_in_abilities_def1044); 

            	    match(input,11,FOLLOW_11_in_abilities_def1046); 

            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:238:32: ( gui_def )
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:238:33: gui_def
            	    {
            	    pushFollow(FOLLOW_gui_def_in_abilities_def1049);
            	    gui_def();

            	    state._fsp--;


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "abilities_def"



    // $ANTLR start "sensor_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:241:1: sensor_def : CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* ;
    public final void sensor_def() throws RecognitionException {
        Token CAPITALIZED_ID27=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:241:11: ( CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )* )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:242:5: CAPITALIZED_ID ( attribute_def ';' )* ( sensorMeasurement_def ';' )*
            {
            CAPITALIZED_ID27=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensor_def1066); 

            context.currentSensor = new Sensor((CAPITALIZED_ID27!=null?CAPITALIZED_ID27.getText():null));

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:244:5: ( attribute_def ';' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==19) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:244:6: attribute_def ';'
            	    {
            	    pushFollow(FOLLOW_attribute_def_in_sensor_def1079);
            	    attribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1081); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:245:5: ( sensorMeasurement_def ';' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==29) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:245:6: sensorMeasurement_def ';'
            	    {
            	    pushFollow(FOLLOW_sensorMeasurement_def_in_sensor_def1090);
            	    sensorMeasurement_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_sensor_def1092); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            context.currentSensor.generateCode();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sensor_def"



    // $ANTLR start "attribute_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:249:1: attribute_def : 'attribute' lc_id ':' dataType ;
    public final void attribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id28 =null;

        VocabSpecParser.dataType_return dataType29 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:249:14: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:250:5: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_attribute_def1113); 

            pushFollow(FOLLOW_lc_id_in_attribute_def1115);
            lc_id28=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_attribute_def1117); 

            pushFollow(FOLLOW_dataType_in_attribute_def1119);
            dataType29=dataType();

            state._fsp--;


             context.currentSensor.addAttribute((lc_id28!=null?input.toString(lc_id28.start,lc_id28.stop):null), (dataType29!=null?input.toString(dataType29.start,dataType29.stop):null));  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "attribute_def"



    // $ANTLR start "sensorMeasurement_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:254:1: sensorMeasurement_def : 'generate' lc_id ':' CAPITALIZED_ID ;
    public final void sensorMeasurement_def() throws RecognitionException {
        Token CAPITALIZED_ID31=null;
        VocabSpecParser.lc_id_return lc_id30 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:254:23: ( 'generate' lc_id ':' CAPITALIZED_ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:255:5: 'generate' lc_id ':' CAPITALIZED_ID
            {
            match(input,29,FOLLOW_29_in_sensorMeasurement_def1139); 

            pushFollow(FOLLOW_lc_id_in_sensorMeasurement_def1141);
            lc_id30=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_sensorMeasurement_def1143); 

            CAPITALIZED_ID31=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1146); 

             context.currentSensor.addSensorMeasurement((lc_id30!=null?input.toString(lc_id30.start,lc_id30.stop):null), (CAPITALIZED_ID31!=null?CAPITALIZED_ID31.getText():null) ,context.getStructSymblTable((CAPITALIZED_ID31!=null?CAPITALIZED_ID31.getText():null)) ); 
                context.constructSymbTable((lc_id30!=null?input.toString(lc_id30.start,lc_id30.stop):null), (CAPITALIZED_ID31!=null?CAPITALIZED_ID31.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sensorMeasurement_def"



    // $ANTLR start "actuator_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:260:1: actuator_def : CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* ;
    public final void actuator_def() throws RecognitionException {
        Token CAPITALIZED_ID32=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:260:13: ( CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )* )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:261:4: CAPITALIZED_ID ( actuatorAttribute_def ';' )* ( action_def ';' )*
            {
            CAPITALIZED_ID32=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_actuator_def1164); 

            context.currentActuator = new Actuator((CAPITALIZED_ID32!=null?CAPITALIZED_ID32.getText():null));

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:263:4: ( actuatorAttribute_def ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==19) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:263:5: actuatorAttribute_def ';'
            	    {
            	    pushFollow(FOLLOW_actuatorAttribute_def_in_actuator_def1175);
            	    actuatorAttribute_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1177); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:264:4: ( action_def ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==17) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:264:5: action_def ';'
            	    {
            	    pushFollow(FOLLOW_action_def_in_actuator_def1185);
            	    action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_actuator_def1187); 

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            context.currentActuator.generateCode();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "actuator_def"



    // $ANTLR start "actuatorAttribute_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:268:1: actuatorAttribute_def : 'attribute' lc_id ':' dataType ;
    public final void actuatorAttribute_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id33 =null;

        VocabSpecParser.dataType_return dataType34 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:268:22: ( 'attribute' lc_id ':' dataType )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:269:6: 'attribute' lc_id ':' dataType
            {
            match(input,19,FOLLOW_19_in_actuatorAttribute_def1210); 

            pushFollow(FOLLOW_lc_id_in_actuatorAttribute_def1212);
            lc_id33=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_actuatorAttribute_def1214); 

            pushFollow(FOLLOW_dataType_in_actuatorAttribute_def1216);
            dataType34=dataType();

            state._fsp--;


             context.currentActuator.addAttribute((lc_id33!=null?input.toString(lc_id33.start,lc_id33.stop):null), (dataType34!=null?input.toString(dataType34.start,dataType34.stop):null));  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "actuatorAttribute_def"



    // $ANTLR start "action_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:273:1: action_def : 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' ;
    public final void action_def() throws RecognitionException {
        Token CAPITALIZED_ID35=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:273:11: ( 'action' CAPITALIZED_ID '(' ( parameter_def )? ')' )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:274:5: 'action' CAPITALIZED_ID '(' ( parameter_def )? ')'
            {
            match(input,17,FOLLOW_17_in_action_def1235); 

            CAPITALIZED_ID35=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_action_def1237); 

            match(input,8,FOLLOW_8_in_action_def1239); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:274:33: ( parameter_def )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:274:34: parameter_def
                    {
                    pushFollow(FOLLOW_parameter_def_in_action_def1242);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_action_def1246); 

             context.currentActuator.addAction((CAPITALIZED_ID35!=null?CAPITALIZED_ID35.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "action_def"



    // $ANTLR start "parameter_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:278:1: parameter_def : lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? ;
    public final void parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID37=null;
        VocabSpecParser.lc_id_return lc_id36 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:278:15: ( lc_id ':' CAPITALIZED_ID ( ',' parameter_def )? )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:279:5: lc_id ':' CAPITALIZED_ID ( ',' parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_parameter_def1266);
            lc_id36=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_parameter_def1268); 

            CAPITALIZED_ID37=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_parameter_def1271); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:279:31: ( ',' parameter_def )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==10) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:279:32: ',' parameter_def
                    {
                    match(input,10,FOLLOW_10_in_parameter_def1274); 

                    pushFollow(FOLLOW_parameter_def_in_parameter_def1276);
                    parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             
                context.currentActuator.addParameter((lc_id36!=null?input.toString(lc_id36.start,lc_id36.stop):null), (CAPITALIZED_ID37!=null?CAPITALIZED_ID37.getText():null)); 
                context.constructSymbTable((lc_id36!=null?input.toString(lc_id36.start,lc_id36.stop):null), (CAPITALIZED_ID37!=null?CAPITALIZED_ID37.getText():null));
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parameter_def"



    // $ANTLR start "gui_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:286:1: gui_def : CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )* ;
    public final void gui_def() throws RecognitionException {
        Token CAPITALIZED_ID38=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:286:8: ( CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )* )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:287:3: CAPITALIZED_ID ( gui_action_def ';' )* ( gui_command_def ';' )* ( gui_request_def ';' )*
            {
            CAPITALIZED_ID38=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_def1296); 

                context.currentGUI = new GUI();
              

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:290:4: ( gui_action_def ';' )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==17) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:290:5: gui_action_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_action_def_in_gui_def1306);
            	    gui_action_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1308); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:291:4: ( gui_command_def ';' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:291:5: gui_command_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_command_def_in_gui_def1316);
            	    gui_command_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1318); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:292:4: ( gui_request_def ';' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==34) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:292:5: gui_request_def ';'
            	    {
            	    pushFollow(FOLLOW_gui_request_def_in_gui_def1326);
            	    gui_request_def();

            	    state._fsp--;


            	    match(input,12,FOLLOW_12_in_gui_def1329); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            context.currentGUI.setGUIName((CAPITALIZED_ID38!=null?CAPITALIZED_ID38.getText():null));
                context.currentGUI.createGUIObject();
                context.currentGUI.generateCode();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "gui_def"



    // $ANTLR start "gui_action_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:298:1: gui_action_def : 'action' name= CAPITALIZED_ID '(' ( gui_parameter_def )? ')' 'with' ui= CAPITALIZED_ID ;
    public final void gui_action_def() throws RecognitionException {
        Token name=null;
        Token ui=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:298:15: ( 'action' name= CAPITALIZED_ID '(' ( gui_parameter_def )? ')' 'with' ui= CAPITALIZED_ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:299:5: 'action' name= CAPITALIZED_ID '(' ( gui_parameter_def )? ')' 'with' ui= CAPITALIZED_ID
            {
            match(input,17,FOLLOW_17_in_gui_action_def1351); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def1357); 

            match(input,8,FOLLOW_8_in_gui_action_def1359); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:299:40: ( gui_parameter_def )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:299:41: gui_parameter_def
                    {
                    pushFollow(FOLLOW_gui_parameter_def_in_gui_action_def1362);
                    gui_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_gui_action_def1366); 

            match(input,42,FOLLOW_42_in_gui_action_def1368); 

            ui=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_action_def1374); 

             context.currentGUI.addAction((name!=null?name.getText():null),(ui!=null?ui.getText():null) ); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "gui_action_def"



    // $ANTLR start "gui_parameter_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:303:1: gui_parameter_def : lc_id ':' CAPITALIZED_ID ( ',' gui_parameter_def )? ;
    public final void gui_parameter_def() throws RecognitionException {
        Token CAPITALIZED_ID40=null;
        VocabSpecParser.lc_id_return lc_id39 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:303:19: ( lc_id ':' CAPITALIZED_ID ( ',' gui_parameter_def )? )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:304:5: lc_id ':' CAPITALIZED_ID ( ',' gui_parameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_gui_parameter_def1394);
            lc_id39=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_gui_parameter_def1396); 

            CAPITALIZED_ID40=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_parameter_def1399); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:304:31: ( ',' gui_parameter_def )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==10) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:304:32: ',' gui_parameter_def
                    {
                    match(input,10,FOLLOW_10_in_gui_parameter_def1402); 

                    pushFollow(FOLLOW_gui_parameter_def_in_gui_parameter_def1404);
                    gui_parameter_def();

                    state._fsp--;


                    }
                    break;

            }


             
                context.currentGUI.addParameter((lc_id39!=null?input.toString(lc_id39.start,lc_id39.stop):null), (CAPITALIZED_ID40!=null?CAPITALIZED_ID40.getText():null)); 
                context.constructSymbTable((lc_id39!=null?input.toString(lc_id39.start,lc_id39.stop):null), (CAPITALIZED_ID40!=null?CAPITALIZED_ID40.getText():null));
                
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "gui_parameter_def"



    // $ANTLR start "gui_command_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:312:1: gui_command_def : 'command' name= CAPITALIZED_ID '(' ( guiParameter_def )? ')' 'to' 'region-hops' ':' INT ':' region= CAPITALIZED_ID 'with' textbox= CAPITALIZED_ID button= CAPITALIZED_ID ;
    public final void gui_command_def() throws RecognitionException {
        Token name=null;
        Token region=null;
        Token textbox=null;
        Token button=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:312:17: ( 'command' name= CAPITALIZED_ID '(' ( guiParameter_def )? ')' 'to' 'region-hops' ':' INT ':' region= CAPITALIZED_ID 'with' textbox= CAPITALIZED_ID button= CAPITALIZED_ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:313:5: 'command' name= CAPITALIZED_ID '(' ( guiParameter_def )? ')' 'to' 'region-hops' ':' INT ':' region= CAPITALIZED_ID 'with' textbox= CAPITALIZED_ID button= CAPITALIZED_ID
            {
            match(input,21,FOLLOW_21_in_gui_command_def1427); 

            name=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1434); 

            match(input,8,FOLLOW_8_in_gui_command_def1436); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:313:42: ( guiParameter_def )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:313:43: guiParameter_def
                    {
                    pushFollow(FOLLOW_guiParameter_def_in_gui_command_def1439);
                    guiParameter_def();

                    state._fsp--;


                    }
                    break;

            }


            match(input,9,FOLLOW_9_in_gui_command_def1443); 

            match(input,41,FOLLOW_41_in_gui_command_def1445); 

            match(input,32,FOLLOW_32_in_gui_command_def1448); 

            match(input,11,FOLLOW_11_in_gui_command_def1450); 

            match(input,INT,FOLLOW_INT_in_gui_command_def1452); 

            match(input,11,FOLLOW_11_in_gui_command_def1454); 

            region=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1460); 

            match(input,42,FOLLOW_42_in_gui_command_def1462); 

            textbox=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1468); 

            button=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_gui_command_def1474); 

             
                  context.currentGUI.addCommand((name!=null?name.getText():null),new Widget((textbox!=null?textbox.getText():null),(button!=null?button.getText():null),""));  
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "gui_command_def"



    // $ANTLR start "gui_request_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:319:1: gui_request_def : 'request' lc_id ;
    public final void gui_request_def() throws RecognitionException {
        VocabSpecParser.lc_id_return lc_id41 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:319:17: ( 'request' lc_id )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:320:4: 'request' lc_id
            {
            match(input,34,FOLLOW_34_in_gui_request_def1494); 

            pushFollow(FOLLOW_lc_id_in_gui_request_def1496);
            lc_id41=lc_id();

            state._fsp--;


             context.currentGUI.getDataAccessListFromSymblTable((lc_id41!=null?input.toString(lc_id41.start,lc_id41.stop):null));
               context.currentGUI.setRequestType(context.getResponseTypeSymblTable((lc_id41!=null?input.toString(lc_id41.start,lc_id41.stop):null)));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "gui_request_def"



    // $ANTLR start "req_ui_parameter"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:325:1: req_ui_parameter : textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID ;
    public final void req_ui_parameter() throws RecognitionException {
        Token textbox=null;
        Token button=null;
        Token textview=null;

        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:325:18: (textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:326:5: textbox= CAPITALIZED_ID button= CAPITALIZED_ID textview= CAPITALIZED_ID
            {
            textbox=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1520); 

            button=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1526); 

            textview=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1532); 

            context.currentGUI.setReqWidget((textbox!=null?textbox.getText():null),(button!=null?button.getText():null),(textview!=null?textview.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "req_ui_parameter"



    // $ANTLR start "guiParameter_def"
    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:330:1: guiParameter_def : lc_id ':' CAPITALIZED_ID ( ',' guiParameter_def )? ;
    public final void guiParameter_def() throws RecognitionException {
        Token CAPITALIZED_ID43=null;
        VocabSpecParser.lc_id_return lc_id42 =null;


        try {
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:330:18: ( lc_id ':' CAPITALIZED_ID ( ',' guiParameter_def )? )
            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:331:5: lc_id ':' CAPITALIZED_ID ( ',' guiParameter_def )?
            {
            pushFollow(FOLLOW_lc_id_in_guiParameter_def1552);
            lc_id42=lc_id();

            state._fsp--;


            match(input,11,FOLLOW_11_in_guiParameter_def1554); 

            CAPITALIZED_ID43=(Token)match(input,CAPITALIZED_ID,FOLLOW_CAPITALIZED_ID_in_guiParameter_def1557); 

            // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:331:31: ( ',' guiParameter_def )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==10) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/soukou/git/FrameworkGenerator4/ANTLR/src/fr/inria/arles/pankesh/parser/antlr/VocabSpec.g:331:32: ',' guiParameter_def
                    {
                    match(input,10,FOLLOW_10_in_guiParameter_def1560); 

                    pushFollow(FOLLOW_guiParameter_def_in_guiParameter_def1562);
                    guiParameter_def();

                    state._fsp--;


                    }
                    break;

            }


             
                context.currentGUI.addParameter((lc_id42!=null?input.toString(lc_id42.start,lc_id42.stop):null), (CAPITALIZED_ID43!=null?CAPITALIZED_ID43.getText():null)); 
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "guiParameter_def"

    // Delegated rules


 

    public static final BitSet FOLLOW_33_in_vocabSpec63 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec71 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_region_def_in_vocabSpec74 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_40_in_vocabSpec91 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_struct_def_in_vocabSpec124 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_35_in_vocabSpec134 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_vocabSpec136 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_abilities_def_in_vocabSpec138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_region_def165 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_region_def167 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_region_def169 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_region_def172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_sc_def189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_sc_def192 = new BitSet(new long[]{0x0000004000400010L});
    public static final BitSet FOLLOW_22_in_sc_def203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_cs_def_in_sc_def206 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_24_in_sc_def216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_controller_def_in_sc_def219 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_ss_def240 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_storageAttribute_def_in_ss_def253 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def255 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_storageDataAccess_def_in_ss_def264 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ss_def266 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19_in_storageAttribute_def290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageAttribute_def292 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageAttribute_def294 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_storageAttribute_def296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storageGeneratedInfo_def_in_storageDataAccess_def317 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_storageDataAccess_def320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_storagedataIndex_def_in_storageDataAccess_def322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_storageGeneratedInfo_def341 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_storageGeneratedInfo_def343 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storageGeneratedInfo_def345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_storageGeneratedInfo_def348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_storagedataIndex_def370 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagedataIndex_def372 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_storagedataIndex_def374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_storagePartition_def403 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_storagePartition_def405 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_storagePartition_def411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_controller_def428 = new BitSet(new long[]{0x0000000080A80002L});
    public static final BitSet FOLLOW_cntrlAttribute_def_in_controller_def441 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def443 = new BitSet(new long[]{0x0000000080A80002L});
    public static final BitSet FOLLOW_cntrlConsumeInfo_def_in_controller_def452 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def454 = new BitSet(new long[]{0x0000000080A00002L});
    public static final BitSet FOLLOW_cntrlCommand_def_in_controller_def463 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def465 = new BitSet(new long[]{0x0000000080200002L});
    public static final BitSet FOLLOW_cntrlPartition_def_in_controller_def475 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_controller_def477 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_cntrlPartition_def498 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlPartition_def500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlPartition_def502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_cntrlAttribute_def520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlAttribute_def522 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlAttribute_def524 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_cntrlAttribute_def526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_cntrlConsumeInfo_def542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_cntrlConsumeInfo_def544 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_cntrlConsumeInfo_def547 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cntrlConsumeInfo_def549 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def551 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlConsumeInfo_def553 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlConsumeInfo_def555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlConsumeInfo_def557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_cntrlCommand_def582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def589 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_cntrlCommand_def591 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_cntrlParameter_def_in_cntrlCommand_def594 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_cntrlCommand_def598 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_cntrlCommand_def600 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_cntrlCommand_def603 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def605 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_cntrlCommand_def607 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_cntrlCommand_def609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cntrlCommand_def611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_cntrlParameter_def631 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_cntrlParameter_def635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_cntrlParameter_def637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_cs_def658 = new BitSet(new long[]{0x00000004A0880002L});
    public static final BitSet FOLLOW_csAttribute_def_in_cs_def671 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def673 = new BitSet(new long[]{0x00000004A0880002L});
    public static final BitSet FOLLOW_csGeneratedInfo_def_in_cs_def682 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def684 = new BitSet(new long[]{0x00000004A0800002L});
    public static final BitSet FOLLOW_csConsumeInfo_def_in_cs_def694 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def696 = new BitSet(new long[]{0x0000000480800002L});
    public static final BitSet FOLLOW_csRequest_def_in_cs_def706 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def709 = new BitSet(new long[]{0x0000000480000002L});
    public static final BitSet FOLLOW_partition_def_in_cs_def718 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_cs_def720 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_19_in_csAttribute_def741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csAttribute_def743 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csAttribute_def745 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_csAttribute_def747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_csGeneratedInfo_def766 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csGeneratedInfo_def768 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csGeneratedInfo_def770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csGeneratedInfo_def773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_csConsumeInfo_def791 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csConsumeInfo_def793 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_csConsumeInfo_def796 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_csConsumeInfo_def798 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def800 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_csConsumeInfo_def802 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_csConsumeInfo_def804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_csConsumeInfo_def806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_csRequest_def828 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_csRequest_def830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_partition_def850 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_partition_def852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_partition_def854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_struct_def873 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_structField_def_in_struct_def887 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_struct_def889 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_lc_id_in_structField_def911 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_structField_def913 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_structField_def915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lc_id931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_dataType944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primitiveType959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_primitiveType965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primitiveType971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_primitiveType980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_primitiveType988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_primitiveType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_abilities_def1007 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_sensor_def_in_abilities_def1014 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_18_in_abilities_def1020 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_actuator_def_in_abilities_def1025 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_39_in_abilities_def1031 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ss_def_in_abilities_def1037 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_27_in_abilities_def1044 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_abilities_def1046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_gui_def_in_abilities_def1049 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensor_def1066 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_attribute_def_in_sensor_def1079 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1081 = new BitSet(new long[]{0x0000000020080002L});
    public static final BitSet FOLLOW_sensorMeasurement_def_in_sensor_def1090 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_sensor_def1092 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19_in_attribute_def1113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_attribute_def1115 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_attribute_def1117 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_attribute_def1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_sensorMeasurement_def1139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_sensorMeasurement_def1141 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_sensorMeasurement_def1143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_sensorMeasurement_def1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_actuator_def1164 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_actuatorAttribute_def_in_actuator_def1175 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1177 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_action_def_in_actuator_def1185 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_actuator_def1187 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_19_in_actuatorAttribute_def1210 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_actuatorAttribute_def1212 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_actuatorAttribute_def1214 = new BitSet(new long[]{0x000000004410E000L});
    public static final BitSet FOLLOW_dataType_in_actuatorAttribute_def1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_action_def1235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_action_def1237 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_action_def1239 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_parameter_def_in_action_def1242 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_action_def1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_parameter_def1266 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_parameter_def1268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_parameter_def1271 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_parameter_def1274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parameter_def_in_parameter_def1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_def1296 = new BitSet(new long[]{0x0000000400220002L});
    public static final BitSet FOLLOW_gui_action_def_in_gui_def1306 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1308 = new BitSet(new long[]{0x0000000400220002L});
    public static final BitSet FOLLOW_gui_command_def_in_gui_def1316 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1318 = new BitSet(new long[]{0x0000000400200002L});
    public static final BitSet FOLLOW_gui_request_def_in_gui_def1326 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_gui_def1329 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_17_in_gui_action_def1351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def1357 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_gui_action_def1359 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_gui_parameter_def_in_gui_action_def1362 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_gui_action_def1366 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_gui_action_def1368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_action_def1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_gui_parameter_def1394 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_parameter_def1396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_parameter_def1399 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_gui_parameter_def1402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_gui_parameter_def_in_gui_parameter_def1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_gui_command_def1427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1434 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_gui_command_def1436 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_guiParameter_def_in_gui_command_def1439 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_gui_command_def1443 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_gui_command_def1445 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_gui_command_def1448 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_command_def1450 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_gui_command_def1452 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_gui_command_def1454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1460 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_gui_command_def1462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_gui_command_def1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_gui_request_def1494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_lc_id_in_gui_request_def1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_req_ui_parameter1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lc_id_in_guiParameter_def1552 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_guiParameter_def1554 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CAPITALIZED_ID_in_guiParameter_def1557 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_guiParameter_def1560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_guiParameter_def_in_guiParameter_def1562 = new BitSet(new long[]{0x0000000000000002L});

}