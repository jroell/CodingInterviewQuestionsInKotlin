package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Since XML is very verbose, you are given a way of encoding it where each tag gets mapped to a pre-defined integer
// value. The language/grammar is as follows:
// Element --> Tag Attributes END Children END
// Attribute --> Tag Value
// END --> 0
// Tag --> some predefined mapping to int
// Value string value

// For example, the following XML might be converted into the compressed string below ( assuming a mapping of family
// -> -, person -> 2, firstName -> 3, lastName -> 4, state ->5).
//
//<family lastName="Roell" state="CA">
//    <person firstName="Jason">Some Message</person>
//</family>
//
// Becomes:
// - 4 Roell 5 CA 0 2 3 Jason 0 Some Message 0 0