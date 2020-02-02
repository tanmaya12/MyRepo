package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomAnno {
//	String name() default "cabu";
//	//int count();
//	String[] tags();
	
	public enum Priority {
		   LOW, MEDIUM, HIGH
		}

		Priority priority() default Priority.MEDIUM;
		
		String[] tags() default "";
		
		String createdBy() default "Tanmay";
		
		String lastModified() default "03/01/2014";
}
