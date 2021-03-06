// $ANTLR 3.4 Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g 2013-05-16 18:23:09

  package fr.inria.arles.pankesh.parser.antlr; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class NetworkSpecLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int CAPITALIZED_ID=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int MOBILEFLAG=7;
    public static final int WS=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public NetworkSpecLexer() {} 
    public NetworkSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public NetworkSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:11:6: ( ',' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:11:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:12:7: ( ':' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:13:7: ( ';' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:14:7: ( 'devices' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:14:9: 'devices'
            {
            match("devices"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:15:7: ( 'mobile' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:15:9: 'mobile'
            {
            match("mobile"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:16:7: ( 'networkaddress' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:16:9: 'networkaddress'
            {
            match("networkaddress"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:17:7: ( 'region' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:17:9: 'region'
            {
            match("region"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:18:7: ( 'resources' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:18:9: 'resources'
            {
            match("resources"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:19:7: ( 'type' )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:19:9: 'type'
            {
            match("type"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "MOBILEFLAG"
    public final void mMOBILEFLAG() throws RecognitionException {
        try {
            int _type = MOBILEFLAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:72:12: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:72:15: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:72:24: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOBILEFLAG"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:75:5: ( 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:75:7: 'a' .. 'z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
            {
            matchRange('a','z'); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:75:17: ( 'a' .. 'z' | 'A' .. 'Z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 'A' && LA2_0 <= 'Z')||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:75:41: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:78:5: ( '0' .. '9' ( '0' .. '9' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:78:7: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:78:15: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "CAPITALIZED_ID"
    public final void mCAPITALIZED_ID() throws RecognitionException {
        try {
            int _type = CAPITALIZED_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:80:15: ( 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )* )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:80:17: 'A' .. 'Z' ( 'a' .. 'z' | 'A' .. 'Z' )* ( '0' .. '9' )*
            {
            matchRange('A','Z'); 

            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:80:26: ( 'a' .. 'z' | 'A' .. 'Z' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:80:50: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CAPITALIZED_ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:82:3: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:82:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:82:5: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||(LA7_0 >= '\f' && LA7_0 <= '\r')||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | MOBILEFLAG | ID | INT | CAPITALIZED_ID | WS )
        int alt8=14;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:51: T__16
                {
                mT__16(); 


                }
                break;
            case 9 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:57: T__17
                {
                mT__17(); 


                }
                break;
            case 10 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:63: MOBILEFLAG
                {
                mMOBILEFLAG(); 


                }
                break;
            case 11 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:74: ID
                {
                mID(); 


                }
                break;
            case 12 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:77: INT
                {
                mINT(); 


                }
                break;
            case 13 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:81: CAPITALIZED_ID
                {
                mCAPITALIZED_ID(); 


                }
                break;
            case 14 :
                // Y:\\git\\ToolSuite\\ANTLR\\src\\fr\\inria\\arles\\pankesh\\parser\\antlr\\NetworkSpec.g:1:96: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\4\uffff\6\12\4\uffff\24\12\1\52\1\53\6\12\2\uffff\1\53\1\12\1\63"+
        "\1\12\1\65\1\12\1\67\1\uffff\1\12\1\uffff\1\12\1\uffff\3\12\1\75"+
        "\1\12\1\uffff\3\12\1\102\1\uffff";
    static final String DFA8_eofS =
        "\103\uffff";
    static final String DFA8_minS =
        "\1\11\3\uffff\1\145\1\157\2\145\1\162\1\141\4\uffff\1\166\1\142"+
        "\1\164\1\147\1\160\1\165\1\154\2\151\1\167\1\151\1\157\2\145\1\163"+
        "\1\143\1\154\2\157\1\165\2\60\3\145\1\162\1\156\1\162\2\uffff\1"+
        "\60\1\163\1\60\1\153\1\60\1\143\1\60\1\uffff\1\141\1\uffff\1\145"+
        "\1\uffff\1\144\1\163\1\144\1\60\1\162\1\uffff\1\145\2\163\1\60\1"+
        "\uffff";
    static final String DFA8_maxS =
        "\1\172\3\uffff\1\145\1\157\2\145\1\171\1\141\4\uffff\1\166\1\142"+
        "\1\164\1\163\1\160\1\165\1\154\2\151\1\167\1\151\1\157\2\145\1\163"+
        "\1\143\1\154\2\157\1\165\2\172\3\145\1\162\1\156\1\162\2\uffff\1"+
        "\172\1\163\1\172\1\153\1\172\1\143\1\172\1\uffff\1\141\1\uffff\1"+
        "\145\1\uffff\1\144\1\163\1\144\1\172\1\162\1\uffff\1\145\2\163\1"+
        "\172\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\6\uffff\1\13\1\14\1\15\1\16\34\uffff\1\11\1"+
        "\12\7\uffff\1\5\1\uffff\1\7\1\uffff\1\4\5\uffff\1\10\4\uffff\1\6";
    static final String DFA8_specialS =
        "\103\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\15\1\uffff\2\15\22\uffff\1\15\13\uffff\1\1\3\uffff\12\13"+
            "\1\2\1\3\5\uffff\32\14\6\uffff\3\12\1\4\1\12\1\11\6\12\1\5\1"+
            "\6\3\12\1\7\1\12\1\10\6\12",
            "",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\23\6\uffff\1\22",
            "\1\24",
            "",
            "",
            "",
            "",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30\13\uffff\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\62",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\64",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\66",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "",
            "\1\70",
            "",
            "\1\71",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\12\7\uffff\32\12\6\uffff\32\12",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | MOBILEFLAG | ID | INT | CAPITALIZED_ID | WS );";
        }
    }
 

}