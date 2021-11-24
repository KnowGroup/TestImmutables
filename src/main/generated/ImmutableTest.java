

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Test}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTest.builder()}.
 */
@Generated(from = "Test", generator = "Immutables")
@SuppressWarnings({"all"})
@javax.annotation.Generated("org.immutables.processor.ProxyProcessor")
public final class ImmutableTest implements Test {
  private final String value;

  private ImmutableTest(String value) {
    this.value = value;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @Override
  public String value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Test#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTest withValue(String value) {
    String newValue = Objects.requireNonNull(value, "value");
    if (this.value.equals(newValue)) return this;
    return new ImmutableTest(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTest
        && equalTo((ImmutableTest) another);
  }

  private boolean equalTo(ImmutableTest another) {
    return value.equals(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + value.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Test} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Test{"
        + "value=" + value
        + "}";
  }

  /**
   * Creates an immutable copy of a {@link Test} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Test instance
   */
  public static ImmutableTest copyOf(Test instance) {
    if (instance instanceof ImmutableTest) {
      return (ImmutableTest) instance;
    }
    return ImmutableTest.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTest ImmutableTest}.
   * <pre>
   * ImmutableTest.builder()
   *    .value(String) // required {@link Test#value() value}
   *    .build();
   * </pre>
   * @return A new ImmutableTest builder
   */
  public static ImmutableTest.Builder builder() {
    return new ImmutableTest.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTest ImmutableTest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Test", generator = "Immutables")
  public static final class Builder {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private String value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Test} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Test instance) {
      Objects.requireNonNull(instance, "instance");
      value(instance.value());
      return this;
    }

    /**
     * Initializes the value for the {@link Test#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder value(String value) {
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTest ImmutableTest}.
     * @return An immutable instance of Test
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTest build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTest(value);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      return "Cannot build Test, some of required attributes are not set " + attributes;
    }
  }
}
