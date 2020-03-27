/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Thrift wrapper around
 * org.apache.hadoop.hbase.TableName
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-03-21")
public class TTableName implements org.apache.thrift.TBase<TTableName, TTableName._Fields>, java.io.Serializable, Cloneable, Comparable<TTableName> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTableName");

  private static final org.apache.thrift.protocol.TField NS_FIELD_DESC = new org.apache.thrift.protocol.TField("ns", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField QUALIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("qualifier", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTableNameStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTableNameTupleSchemeFactory();

  /**
   * namespace name
   */
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer ns; // optional
  /**
   * tablename
   */
  public @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer qualifier; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * namespace name
     */
    NS((short)1, "ns"),
    /**
     * tablename
     */
    QUALIFIER((short)2, "qualifier");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NS
          return NS;
        case 2: // QUALIFIER
          return QUALIFIER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.NS};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NS, new org.apache.thrift.meta_data.FieldMetaData("ns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.QUALIFIER, new org.apache.thrift.meta_data.FieldMetaData("qualifier", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTableName.class, metaDataMap);
  }

  public TTableName() {
  }

  public TTableName(
    java.nio.ByteBuffer qualifier)
  {
    this();
    this.qualifier = org.apache.thrift.TBaseHelper.copyBinary(qualifier);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTableName(TTableName other) {
    if (other.isSetNs()) {
      this.ns = org.apache.thrift.TBaseHelper.copyBinary(other.ns);
    }
    if (other.isSetQualifier()) {
      this.qualifier = org.apache.thrift.TBaseHelper.copyBinary(other.qualifier);
    }
  }

  public TTableName deepCopy() {
    return new TTableName(this);
  }

  @Override
  public void clear() {
    this.ns = null;
    this.qualifier = null;
  }

  /**
   * namespace name
   */
  public byte[] getNs() {
    setNs(org.apache.thrift.TBaseHelper.rightSize(ns));
    return ns == null ? null : ns.array();
  }

  public java.nio.ByteBuffer bufferForNs() {
    return org.apache.thrift.TBaseHelper.copyBinary(ns);
  }

  /**
   * namespace name
   */
  public TTableName setNs(byte[] ns) {
    this.ns = ns == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(ns.clone());
    return this;
  }

  public TTableName setNs(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer ns) {
    this.ns = org.apache.thrift.TBaseHelper.copyBinary(ns);
    return this;
  }

  public void unsetNs() {
    this.ns = null;
  }

  /** Returns true if field ns is set (has been assigned a value) and false otherwise */
  public boolean isSetNs() {
    return this.ns != null;
  }

  public void setNsIsSet(boolean value) {
    if (!value) {
      this.ns = null;
    }
  }

  /**
   * tablename
   */
  public byte[] getQualifier() {
    setQualifier(org.apache.thrift.TBaseHelper.rightSize(qualifier));
    return qualifier == null ? null : qualifier.array();
  }

  public java.nio.ByteBuffer bufferForQualifier() {
    return org.apache.thrift.TBaseHelper.copyBinary(qualifier);
  }

  /**
   * tablename
   */
  public TTableName setQualifier(byte[] qualifier) {
    this.qualifier = qualifier == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(qualifier.clone());
    return this;
  }

  public TTableName setQualifier(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer qualifier) {
    this.qualifier = org.apache.thrift.TBaseHelper.copyBinary(qualifier);
    return this;
  }

  public void unsetQualifier() {
    this.qualifier = null;
  }

  /** Returns true if field qualifier is set (has been assigned a value) and false otherwise */
  public boolean isSetQualifier() {
    return this.qualifier != null;
  }

  public void setQualifierIsSet(boolean value) {
    if (!value) {
      this.qualifier = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NS:
      if (value == null) {
        unsetNs();
      } else {
        if (value instanceof byte[]) {
          setNs((byte[])value);
        } else {
          setNs((java.nio.ByteBuffer)value);
        }
      }
      break;

    case QUALIFIER:
      if (value == null) {
        unsetQualifier();
      } else {
        if (value instanceof byte[]) {
          setQualifier((byte[])value);
        } else {
          setQualifier((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NS:
      return getNs();

    case QUALIFIER:
      return getQualifier();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NS:
      return isSetNs();
    case QUALIFIER:
      return isSetQualifier();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TTableName)
      return this.equals((TTableName)that);
    return false;
  }

  public boolean equals(TTableName that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_ns = true && this.isSetNs();
    boolean that_present_ns = true && that.isSetNs();
    if (this_present_ns || that_present_ns) {
      if (!(this_present_ns && that_present_ns))
        return false;
      if (!this.ns.equals(that.ns))
        return false;
    }

    boolean this_present_qualifier = true && this.isSetQualifier();
    boolean that_present_qualifier = true && that.isSetQualifier();
    if (this_present_qualifier || that_present_qualifier) {
      if (!(this_present_qualifier && that_present_qualifier))
        return false;
      if (!this.qualifier.equals(that.qualifier))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetNs()) ? 131071 : 524287);
    if (isSetNs())
      hashCode = hashCode * 8191 + ns.hashCode();

    hashCode = hashCode * 8191 + ((isSetQualifier()) ? 131071 : 524287);
    if (isSetQualifier())
      hashCode = hashCode * 8191 + qualifier.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTableName other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetNs()).compareTo(other.isSetNs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ns, other.ns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetQualifier()).compareTo(other.isSetQualifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQualifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.qualifier, other.qualifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTableName(");
    boolean first = true;

    if (isSetNs()) {
      sb.append("ns:");
      if (this.ns == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.ns, sb);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("qualifier:");
    if (this.qualifier == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.qualifier, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (qualifier == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'qualifier' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTableNameStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTableNameStandardScheme getScheme() {
      return new TTableNameStandardScheme();
    }
  }

  private static class TTableNameStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTableName> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTableName struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ns = iprot.readBinary();
              struct.setNsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // QUALIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.qualifier = iprot.readBinary();
              struct.setQualifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTableName struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ns != null) {
        if (struct.isSetNs()) {
          oprot.writeFieldBegin(NS_FIELD_DESC);
          oprot.writeBinary(struct.ns);
          oprot.writeFieldEnd();
        }
      }
      if (struct.qualifier != null) {
        oprot.writeFieldBegin(QUALIFIER_FIELD_DESC);
        oprot.writeBinary(struct.qualifier);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTableNameTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTableNameTupleScheme getScheme() {
      return new TTableNameTupleScheme();
    }
  }

  private static class TTableNameTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTableName> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTableName struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBinary(struct.qualifier);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetNs()) {
        oprot.writeBinary(struct.ns);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTableName struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.qualifier = iprot.readBinary();
      struct.setQualifierIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.ns = iprot.readBinary();
        struct.setNsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

