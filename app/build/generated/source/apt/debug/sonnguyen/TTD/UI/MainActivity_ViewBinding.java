// Generated code from Butter Knife. Do not modify!
package sonnguyen.TTD.UI;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import sonnguyen.TTD.R;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  private View view2131427418;

  private View view2131427422;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(final MainActivity target, View source) {
    this.target = target;

    View view;
    target.editRow = Utils.findRequiredViewAsType(source, R.id.edit_row, "field 'editRow'", EditText.class);
    target.editColumn = Utils.findRequiredViewAsType(source, R.id.edit_column, "field 'editColumn'", EditText.class);
    target.lnGroupInput = Utils.findRequiredViewAsType(source, R.id.ln_group_input, "field 'lnGroupInput'", LinearLayout.class);
    target.tvHavePath = Utils.findRequiredViewAsType(source, R.id.tv_havePath, "field 'tvHavePath'", TextView.class);
    target.tvCost = Utils.findRequiredViewAsType(source, R.id.tv_cost, "field 'tvCost'", TextView.class);
    target.tvPath = Utils.findRequiredViewAsType(source, R.id.tv_path, "field 'tvPath'", TextView.class);
    target.tableMatrix = Utils.findRequiredViewAsType(source, R.id.tableMatrix, "field 'tableMatrix'", TableLayout.class);
    view = Utils.findRequiredView(source, R.id.btn_input, "method 'onClick'");
    view2131427418 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_result, "method 'onClick'");
    view2131427422 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editRow = null;
    target.editColumn = null;
    target.lnGroupInput = null;
    target.tvHavePath = null;
    target.tvCost = null;
    target.tvPath = null;
    target.tableMatrix = null;

    view2131427418.setOnClickListener(null);
    view2131427418 = null;
    view2131427422.setOnClickListener(null);
    view2131427422 = null;
  }
}
