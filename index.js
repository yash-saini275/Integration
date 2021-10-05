import React from "react";
import { AppRegistry, StyleSheet, Text, View } from "react-native";

const HelloWorld = (props) => {
  return (
    <View style={styles.container}>
      <Text style={styles.hello}>
        Hello, World, {props.message_from_native}
      </Text>
    </View>
  );
};
var styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
  },
  hello: {
    fontSize: 20,
    textAlign: "center",
    margin: 10,
  },
});

AppRegistry.registerComponent("Integration", () => HelloWorld);
