package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Bool$Q;
//import CC.$.Q$Q_LMNt.Q$Int;
import java.util.Collection;

public interface Bool$Int //extends
//	Bool$Q,
//	Q$Int
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Bool$Int.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	int Bool$Int(boolean In);
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Intg(boolean[] From,int[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Bool$Int(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No)
			default int[] Boolg$Intg(boolean[] In)
			{
				int[] Out=new int[In.length];
				Boolg$Intg(In,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No)
		default void Boolg$Intg(
			Iterable<Boolean> From,
			Collection<Integer> To)
		{
			for(boolean In:From)
			{To.add(Bool$Int(In));}
		}
}