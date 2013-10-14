package com.whattheheckisthis;

import java.util.ArrayList;
import java.util.List;

public class Sample {

List<String> myList = new ArrayList<String>();
//List<Object> objectList = new ArrayList<String>(); In generics ArrayList<String> isn't subtype of List<Object>
//but in array it's possible, like below, but it fails at run time if you try to add String object to below array making array defiecient.

Object[] objArray = new Long[1];

}
