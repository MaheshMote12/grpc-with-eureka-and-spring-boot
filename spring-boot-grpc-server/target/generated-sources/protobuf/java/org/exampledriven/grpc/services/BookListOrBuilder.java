// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BookService.proto

package org.exampledriven.grpc.services;

public interface BookListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.exampledriven.grpc.services.BookList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .org.exampledriven.grpc.services.Book book = 1;</code>
   */
  java.util.List<org.exampledriven.grpc.services.Book> 
      getBookList();
  /**
   * <code>repeated .org.exampledriven.grpc.services.Book book = 1;</code>
   */
  org.exampledriven.grpc.services.Book getBook(int index);
  /**
   * <code>repeated .org.exampledriven.grpc.services.Book book = 1;</code>
   */
  int getBookCount();
  /**
   * <code>repeated .org.exampledriven.grpc.services.Book book = 1;</code>
   */
  java.util.List<? extends org.exampledriven.grpc.services.BookOrBuilder> 
      getBookOrBuilderList();
  /**
   * <code>repeated .org.exampledriven.grpc.services.Book book = 1;</code>
   */
  org.exampledriven.grpc.services.BookOrBuilder getBookOrBuilder(
      int index);
}
