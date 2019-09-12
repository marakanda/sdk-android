package io.ebuilder.ddc.example;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/**
 * Created by <a href="mailto:dmitry.gorohov@ebuilder.com">Dmitry Gorohov</a>
 * Date: 7/26/17
 */

public interface FragmentFacade {
    <T extends Fragment> void switchToPage(final T page, final Bundle arguments);

    <T extends Fragment> void addPageToStack(final T page, final Bundle arguments);
}
