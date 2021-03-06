package sri.mobile

import sri.core._
import sri.mobile.apis.android._
import sri.mobile.apis.ios._
import sri.mobile.modules.NativeModules
import sri.universal.ReactUniversal
import sri.universal.apis._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
trait ReactNative extends ReactUniversal {

  //components
  val DatePickerIOS: ReactClass = js.native
  val MapView: ReactClass = js.native
  val NavigatorIOS: ReactClass = js.native
  val TabBarItemIOS: ReactClass = js.native
  val WebView: ReactClass = js.native
  val TabBarIOS: ReactClass = js.native
  val SegmentedControlIOS: ReactClass = js.native
  val DrawerLayoutAndroid: ReactClass = js.native
  val ProgressBarAndroid: ReactClass = js.native
  val ProgressViewIOS: ReactClass = js.native
  val PickerIOS: ReactClass = js.native
  val ToolbarAndroid: ReactClass = js.native
  val TouchableNativeFeedback: ReactClass = js.native
  val ViewPagerAndroid: ReactClass = js.native
  val DatePickerAndroid: DatePickerAndroid = js.native
  val TimerPickerAndroid: TimerPickerAndroid = js.native
  val StatusBar: ReactClass = js.native

  // apis

  val Alert: Alert = js.native
  val Clipboard: Clipboard = js.native
  val AlertIOS: AlertIOS = js.native
  val NetInfo: NetInfo = js.native
  val LayoutAnimation: LayoutAnimation = js.native
  val PushNotificationIOS: PushNotificationIOS = js.native
  val StatusBarIOS: js.Dynamic = js.native
  val VibrationIOS: VibrationIOS = js.native
  val ToastAndroid: ToastAndroid = js.native
  val BackAndroid: BackAndroid = js.native

  // native stuff
  val NativeModules: NativeModules = js.native

}

@js.native
@JSImport("ReactNativeFeatureFlags", JSImport.Namespace)
object ReactNativeFeatureFlags extends js.Object {

  var useFiber: Boolean = js.native

}
