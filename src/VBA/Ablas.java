package VBA;

import java.lang.*;
	/**
	 * @author Timothy Garrity
	 * @version 1.0 @since 2014-03-25
	 */
public class Ablas {
    //Public Sub ABLASSplitLength(ByRef A() As Double, ByVal N As Long, ByRef N1 As Long, ByRef N2 As Long)
    public static void ABLASSplitLength(double A, long N, long n1, long n2)
    {
        if (N > ABLASBlockSize(A)){
            //ABLASInternalSplitLength(N, ABLASBlockSize(A), n1, n2);
        }else{
         //   ABLASInternalSplitLength(N, ABLASMicroBlockSize(), N1, N2);
        }
    }
    
    //Public Sub ABLASComplexSplitLength(ByRef A() As Complex, ByVal N As Long, ByRef N1 As Long, ByRef N2 As Long)

    public static void ABLASComplexSplitLength(Long A, Long N, Long N1, Long N2)
    {
      /*  if( N>ABLASComplexBlockSize(A))
        {
            ABLASInternalSplitLength(N, ABLASComplexBlockSize(A), N1, N2);
        }else{
            ABLASInternalSplitLength(N, ABLASMicroBlockSize(), N1, N2);
        }*/
    }
    
    //Public Function ABLASBlockSize(ByRef A() As Double) As Long
    public static long ABLASBlockSize(double A)
    {
    return 512;
    }
    
    
    
}