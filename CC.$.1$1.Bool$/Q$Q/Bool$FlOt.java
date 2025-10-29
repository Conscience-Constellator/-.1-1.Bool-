package CC.$.Q$Q;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

//import CC.$.Q$Q_LMNt.Bool$Q;
//import CC.$.Q$Q_LMNt.Q$Flot;
import java.util.Collection;

public interface Bool$FlOt //extends
//	Bool$Q,
//	Q$Flot
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Bool$Flot.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr
	float Bool$Flot(boolean In);
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Boolg$Flotg(
			boolean[] From,
			float[] To)
		{
			for(int IndX=0;
				IndX<From.length;
				IndX+=1)
			{
				To[IndX]=(Bool$Flot(
				From[IndX]));
			}
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default float[] Boolg$Flotg(boolean[] From)
			{
				float[] Out=new float[From.length];

				Boolg$Flotg(From,Out);

				return Out;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Boolg$Flotg(
			Iterable<Boolean> From,
			Collection<Float> To)
		{
			for(boolean In:From)
			{To.add(Bool$Flot(In));}
		}
}