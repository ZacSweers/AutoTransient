package io.sweers.autovaluetransient;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If present on a property, defines whether the property should be ignored when serializing and/or
 * deserializing.
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface AVTransient {
  /**
   * Returns a {@link TransientType} indicating whether this field should be ignored for
   * serialization only, deserialization only, or both. The default is {@link TransientType#BOTH}.
   *
   * @see TransientType
   */
  TransientType value() default TransientType.BOTH;

  enum TransientType {
    /**
     * AVTransient this field for serialization only. The annotated property will be ignored by the
     * generated serializer when generating a JSON serialization.
     */
    SERIALIZATION,

    /**
     * AVTransient this field for both serialization and deserialization.
     * <p>
     * This is the default value for the AVTransient annotation.
     */
    BOTH,

    /**
     * AVTransient this field for deserialization only. The annotated property will be ignored by
     * the generated serializer when creating an object from its serialized format, and instead the
     * default value for this property will be used.
     */
    DESERIALIZATION
  }
}