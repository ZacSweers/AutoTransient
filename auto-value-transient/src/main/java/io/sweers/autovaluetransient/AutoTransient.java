package io.sweers.autovaluetransient;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If present on a property, defines whether the property should be treated as {@code transient}.
 *
 * <p><ul><em>Usage Notes:</em></ul>
 * <li>While left to the implementations of the respective plugins, this should only be applied to optional properties. Applying to a primitive or required property could result in undefined behavior.</li>
 * <li>For serialization: This should be expected for both read and write behavior. There is no way to configure only one or the other via this annotation. Instead, consumers should write a delegating adapter for serialization that only calls through to the delegate for the desired serialization types.</li>
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface AutoTransient {
}