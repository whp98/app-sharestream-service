package xyz.intellij.appsharestream.model;


public class Stream {

  private long streamId;
  private String streamUrl;
  private String streamName;
  private String streamInterduce;
  private long streamFail;
  private double streamCrate;
  private double streamQrate;


  public long getStreamId() {
    return streamId;
  }

  public void setStreamId(long streamId) {
    this.streamId = streamId;
  }


  public String getStreamUrl() {
    return streamUrl;
  }

  public void setStreamUrl(String streamUrl) {
    this.streamUrl = streamUrl;
  }


  public String getStreamName() {
    return streamName;
  }

  public void setStreamName(String streamName) {
    this.streamName = streamName;
  }


  public String getStreamInterduce() {
    return streamInterduce;
  }

  public void setStreamInterduce(String streamInterduce) {
    this.streamInterduce = streamInterduce;
  }


  public long getStreamFail() {
    return streamFail;
  }

  public void setStreamFail(long streamFail) {
    this.streamFail = streamFail;
  }


  public double getStreamCrate() {
    return streamCrate;
  }

  public void setStreamCrate(double streamCrate) {
    this.streamCrate = streamCrate;
  }


  public double getStreamQrate() {
    return streamQrate;
  }

  public void setStreamQrate(double streamQrate) {
    this.streamQrate = streamQrate;
  }

}
